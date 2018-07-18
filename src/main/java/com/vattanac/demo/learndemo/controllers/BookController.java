package com.vattanac.demo.learndemo.controllers;

import com.vattanac.demo.learndemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) { this.bookService = bookService; }

    @GetMapping("/")
    public String index(ModelMap model){

        model.addAttribute("books",this.bookService.getAll());
        System.out.println(bookService.getAll());
        return "index";
    }
}
