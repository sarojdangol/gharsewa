package com.saroj.demo.service.impl;

import com.saroj.demo.dto.UserDTO;
import com.saroj.demo.model.User;
import com.saroj.demo.repository.UserRepository;
import com.saroj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user= new User(userDTO);  // copy userDTO to user
        User savedUser = userRepository.save(user);//save to database
        UserDTO savedUserDTO= new UserDTO(savedUser); //copy user to userDTO
        return savedUserDTO;
    }

    @Override
    public UserDTO findById(int id) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
