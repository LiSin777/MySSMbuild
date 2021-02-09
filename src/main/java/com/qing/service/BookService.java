package com.qing.service;

import com.qing.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books books);
    int updateBook(Books books);
    int deleteBook(int id);
    List<Books> selectBook();
    Books seleBookByID(int id);
    Books queryBook(String bookName);
}
