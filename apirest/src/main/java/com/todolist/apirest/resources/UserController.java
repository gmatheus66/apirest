package com.todolist.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.todolist.apirest.models.User;
import com.todolist.apirest.repository.UserRepository;

@RestController
@RequestMapping(value = "/api/user")
public class UserController{

    @RequestMapping(value = "/")
    public String home(){
        return "Welcome User Api";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> ListUser(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User  getUser(@PathVariable(value = "id") int id){
        return userRepository.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public User setUser(@RequestBody User user){
        return userRepository.save(user);
    }




}
