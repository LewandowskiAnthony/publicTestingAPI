package com.lewandowski.api.publicapitester.controllers;

import com.lewandowski.api.publicapitester.models.User;
import com.lewandowski.api.publicapitester.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {

    UserService service;

    @GetMapping("/")
    public List<User> getUsers(){
        return service.getUserList();
    }

    @GetMapping("/{user_id}")
    public User getUser(@PathVariable("user_id") Integer id){
        return service.getUser(id).orElse(null);
    }
}
