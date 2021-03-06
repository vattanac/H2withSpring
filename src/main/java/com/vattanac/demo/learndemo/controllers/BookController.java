package com.vattanac.demo.learndemo.controllers;

import com.vattanac.demo.learndemo.models.Category;
import com.vattanac.demo.learndemo.services.BookService;
import com.vattanac.demo.learndemo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private BookService bookService;
    private CategoryService categoryService;


    @Autowired
    public BookController(BookService bookService, CategoryService categoryService) {
        this.bookService = bookService;
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String index(ModelMap model){


        model.addAttribute("books",this.bookService.getAll());
        System.out.println(bookService.getAll());
        System.out.println("Category service"+categoryService.getAll());

        return "index";
    }
}
