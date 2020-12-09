package com.webaptstor.demo.Controllers;

import kz.webtodolist.v1.Repositories.UserRepository;
import kz.webtodolist.v1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class TestController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String login
            , @RequestParam String email) {
        User n = new User();
        n.setLogin(login);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path="/")
    public @ResponseBody String index(){
        return "Hello world";
    }
}
