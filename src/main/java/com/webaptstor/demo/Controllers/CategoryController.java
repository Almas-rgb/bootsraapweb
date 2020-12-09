package com.webaptstor.demo.Controllers;

import kz.webtodolist.v1.Category;
import kz.webtodolist.v1.Repositories.CategoryRepository;
import kz.webtodolist.v1.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    //createCategory
    @GetMapping("/category")
    public String category(Model model) {
        Category newCategory = new Category();
        model.addAttribute("category", newCategory);
        return "category";
    }
    @PostMapping("/category")
    public String addNewCategory (@ModelAttribute("category") Category newCategory) {
        categoryRepository.save(newCategory);
        return "redirect:/";
    }

}
