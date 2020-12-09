package com.webaptstor.demo.Controllers;

import kz.webtodolist.v1.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthController {
    @Autowired
    private UserRepository userRepository;

}
