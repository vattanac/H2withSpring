package com.vattanac.demo.learndemo.services;

import com.vattanac.demo.learndemo.models.Book;
import com.vattanac.demo.learndemo.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Book findOne(Integer id);
    boolean Update(Category category);
    boolean Remove(Integer id);
    boolean Create(Category category);

}
