package com.kang.dao;

import com.kang.pojo.Books;

import java.util.List;

/**
 * @author kanseer
 * @create 2021-01-29 21:15
 */
public interface BookMapper {

    int addBook(Books book);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
