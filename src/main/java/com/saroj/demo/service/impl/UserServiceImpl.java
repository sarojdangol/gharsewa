package com.saroj.demo.service.impl;

import com.saroj.demo.dto.UserDTO;
import com.saroj.demo.model.User;
import com.saroj.demo.repository.UserRepository;
import com.saroj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
Optional<User> userOptional = userRepository.findById(id);
User user= userOptional.orElseThrow(()-> new RuntimeException("user with given id not found"));
UserDTO userDTO= new UserDTO(user);
return userDTO;


    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users= userRepository.findAll();
        List<UserDTO> userDTOs= new ArrayList<>();
        for(User user:users){
        UserDTO userDTO= new UserDTO(user);
        userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        findById(userDTO.getId());
    User user= new User(userDTO);
    User updatedUser =userRepository.save(user);
    UserDTO updatedUserDTO= new UserDTO(updatedUser);
    return updatedUserDTO;

    }

    @Override
    public void deleteUser(int id) {
//        findById(id);
        userRepository.deleteById(id);

    }
}
