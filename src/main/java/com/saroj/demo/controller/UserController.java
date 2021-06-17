package com.saroj.demo.controller;

import com.saroj.demo.dto.UserDTO;
import com.saroj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO)
    {
    return userService.addUser(userDTO);
    }

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable int id){
        return userService.findById(id);
    }
}
