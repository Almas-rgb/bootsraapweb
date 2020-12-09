package com.webaptstor.demo.Controllers;

import kz.webtodolist.v1.Category;
import kz.webtodolist.v1.Repositories.CategoryRepository;
import kz.webtodolist.v1.Repositories.TaskRepository;
import kz.webtodolist.v1.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Главная страница");

        Iterable<Task> tasks = taskRepository.findAll();
        model.addAttribute("tasks",tasks);

        Iterable<Category> categories = categoryRepository.findAll();
        Integer countCategory = Math.toIntExact(categoryRepository.count());
        model.addAttribute("categories", categories);
        model.addAttribute("countCategory",countCategory);

        return "index";
    }

    @GetMapping("/sign-in")
    public String sign_in(Model model) {
        model.addAttribute("", "");
        return "sign-in";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("", "");
        return "register";
    }

    /*@GetMapping("/category")
    public String category(Model model) {
        model.addAttribute("", "");
        return "category";
    }*/

    /*@GetMapping("/task")
    public String task(Model model) {
        model.addAttribute("", "");
        return "task";
    }*/

    @GetMapping("/404")
    public String page404(Model model) {
        model.addAttribute("", "");
        return "404";
    }

    @GetMapping("/500")
    public String page500(Model model) {
        model.addAttribute("", "");
        return "500";
    }

}
