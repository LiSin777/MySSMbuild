package com.qing.dao;

import com.qing.pojo.Books;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class BookMapperImpl implements BookMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public int addBook(Books books) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.addBook(books);
    }

    @Override
    public int updateBook(Books books) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.updateBook(books);
    }

    @Override
    public int deleteBook(int id) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.deleteBook(id);
    }

    @Override
    public List<Books> selectBook() {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.selectBook();
    }

    @Override
    public Books seleBookByID(int id) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.seleBookByID(id);
    }

    @Override
    public Books queryBook(String bookName) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.queryBook(bookName);
    }
}
