package com.qing.controller;

import com.qing.pojo.Books;
import com.qing.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.selectBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model , int id){
        Books books = bookService.seleBookByID(id);
        model.addAttribute("book" , books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName , Model model){
        Books books = bookService.queryBook(queryBookName);
        List<Books> list = new ArrayList<>();
        list.add(books);
        if (books == null){
            list = bookService.selectBook();
            model.addAttribute("error" , "未查到");
        }
        model.addAttribute("list" , list);
        return "allBook";
    }
}
