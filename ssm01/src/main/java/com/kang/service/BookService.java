package com.kang.service;

import com.kang.pojo.Books;

import java.util.List;

/**
 * @author kanseer
 * @create 2021-01-29 21:23
 */
public interface BookService {

    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
