package com.vattanac.demo.learndemo.services.implementation;

import com.vattanac.demo.learndemo.models.Book;
import com.vattanac.demo.learndemo.repositories.BookRepository;
import com.vattanac.demo.learndemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookserviceImplementation implements BookService{

    public BookRepository bookRepository;

    @Autowired
    public BookserviceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findOne(Integer id) {
        return null;
    }

    @Override
    public boolean Update(Book book) {
        return false;
    }

    @Override
    public boolean Remove(Integer id) {
        return false;
    }

    @Override
    public boolean Create(Book book) {
        return false;
    }
}
