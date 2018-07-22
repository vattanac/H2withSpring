package com.vattanac.demo.learndemo.services.implementation;

import com.vattanac.demo.learndemo.models.Book;
import com.vattanac.demo.learndemo.models.Category;
import com.vattanac.demo.learndemo.repositories.CategoryRepository;
import com.vattanac.demo.learndemo.services.CategoryService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public class CategorySeriveImp implements CategoryService {

   private CategoryRepository categoryRepository;

    public CategorySeriveImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public Book findOne(Integer id) {
        return null;
    }

    @Override
    public boolean Update(Category category) {
        return false;
    }

    @Override
    public boolean Remove(Integer id) {
        return false;
    }

    @Override
    public boolean Create(Category category) {
        return false;
    }
}
