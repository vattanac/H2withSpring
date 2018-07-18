package com.vattanac.demo.learndemo.services;

import com.vattanac.demo.learndemo.models.Book;
import org.omg.CORBA.INTERNAL;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    List<Book> getAll();
    Book findOne(Integer id);
    boolean Update(Book book);
    boolean Remove(Integer id);
    boolean Create(Book book);
}
