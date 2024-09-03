package com.monolithic.monolithic.controller;


import com.monolithic.monolithic.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private com.monolithic.monolithic.services.UserServices services;

    //create user
    @PostMapping()
    public UserModel addUser(@RequestBody UserModel userModel)
    {
        return services.createUser(userModel);
    }


    //get All users
    @GetMapping()
    public List<UserModel> getAllUsers()
    {
        return services.getAllUsers();
    }

    //get user by id
    @GetMapping(value = "/{userId}")
    public UserModel getUserById(@PathVariable("userId") @RequestBody String userId)
    {
        return services.getUserById(userId);
    }
}