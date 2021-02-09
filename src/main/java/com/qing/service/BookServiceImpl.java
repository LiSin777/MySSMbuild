package com.qing.service;

import com.qing.dao.BookMapper;
import com.qing.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }


    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public List<Books> selectBook() {
        return bookMapper.selectBook();
    }

    @Override
    public Books seleBookByID(int id) {
        return bookMapper.seleBookByID(id);
    }

    @Override
    public Books queryBook(String bookName) {
        return bookMapper.queryBook(bookName);
    }

}
