package com.saroj.demo.service;

import com.saroj.demo.dto.UserDTO;

import java.util.List;

public interface UserService {
UserDTO addUser(UserDTO userDTO); // create
    UserDTO login(String username, String password);
UserDTO findById(int id); //retrieve
List <UserDTO> findAll(); //retrieve
UserDTO updateUser(UserDTO userDTO); //update
void deleteUser(int id); //delete
}
