package com.saroj.demo.service.impl;

import com.saroj.demo.dto.UserDTO;
import com.saroj.demo.model.Admin;
import com.saroj.demo.model.User;
import com.saroj.demo.repository.UserRepository;
import com.saroj.demo.service.AdminService;
import com.saroj.demo.service.UserService;
import com.saroj.demo.utils.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdminService adminService;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user= new User(userDTO);  // copy userDTO to user
        User savedUser = userRepository.save(user);//save to database
        if(userDTO.getRoles().equals(Roles.ADMIN)){
            Admin admin= new Admin();
            admin.getBranch();
            admin.setJoiningDate(userDTO.getJoiningDate());
            admin.setWorkingShift(userDTO.getWorkingShift());
            admin.setPosition(userDTO.getPosition());
            admin.setUser(savedUser);
            adminService.addAdmin(admin);
        }
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

    @Override
    public UserDTO login(String username, String password) {
        Optional<User> OptionalUser = userRepository.findByUsernameAndPassword(username, password);
        User user= OptionalUser.orElseThrow(()-> new RuntimeException("Username or password incorrect"));
        return new UserDTO(user);
    }


}
