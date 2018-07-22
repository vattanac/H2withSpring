package com.vattanac.demo.learndemo.controllers;

import com.vattanac.demo.learndemo.services.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/cate")
    public String cateindex(ModelMap model){
        model.addAttribute("categories",this.categoryService.getAll());
        return "category";
    }
}
