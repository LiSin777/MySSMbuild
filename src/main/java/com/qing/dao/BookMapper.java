package com.qing.dao;

import com.qing.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {
    int addBook(Books books);
    int updateBook(Books books);
    int deleteBook(@Param("id") int id);
    List<Books> selectBook();
    Books seleBookByID(@Param("id") int id);
    Books queryBook(@Param("bookName") String bookName);
}
