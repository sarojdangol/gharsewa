package com.saroj.demo.service.impl;

import com.saroj.demo.dto.AdminDTO;
import com.saroj.demo.dto.UserDTO;
import com.saroj.demo.model.Admin;
import com.saroj.demo.model.User;
import com.saroj.demo.repository.AdminRepository;
import com.saroj.demo.repository.UserRepository;
import com.saroj.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<AdminDTO> findAll() {
        
        List <Admin> adminList= adminRepository.findAll();
        List<AdminDTO> adminDTOList= new ArrayList<>();
        for (Admin admin : adminList) {
            AdminDTO adminDTO= new AdminDTO(admin);
           UserDTO userDTO= new UserDTO(admin.getUser());
           adminDTO.setUserDTO(userDTO);

          adminDTOList.add(adminDTO);
        }
        return adminDTOList;

    }

    @Override
    public AdminDTO findById(int id) {

       Optional<Admin> optionalAdmin= adminRepository.findById(id);
       Admin admin= optionalAdmin.orElseThrow(()-> new RuntimeException("Admin with given id not found"));
       AdminDTO adminDTO= new AdminDTO(admin);
       UserDTO userDTO= new UserDTO(admin.getUser());
       adminDTO.setUserDTO(userDTO);
       return adminDTO;
    }

    @Override
    public Admin addAdmin(Admin admin) {

        return adminRepository.save(admin);
    }

    @Override
    public AdminDTO updateAdmin(AdminDTO adminDTO) {

        Optional<Admin> optionalAdmin= adminRepository.findById(adminDTO.getId());
        Admin admin= optionalAdmin.orElseThrow(()-> new RuntimeException("Admin with given id not found"));

        admin.setPosition(adminDTO.getPosition());
        admin.setJoiningDate(adminDTO.getJoiningDate());
        admin.setWorkingShift(adminDTO.getWorkingShift());
        admin.setBranch(adminDTO.getBranch());

        //UserDTo to update user related data
        UserDTO userDTO= new UserDTO();

        //User associated to the admin
        User user= admin.getUser();

        user.setFirstName(userDTO.getFirstName());
        user.setEmail(userDTO.getEmail());
        user.setLastName(userDTO.getLastName());
        user.setAddress(userDTO.getAddress());

        //save the updated user to user repository
        User updatedUser=userRepository.save(user);

        //set the updated user to admin
        admin.setUser(updatedUser);

        //save the updated admin
        Admin updatedAdmin=adminRepository.save(admin);

        //convert the updated admin and user to dtos
        AdminDTO updatedAdminDTO=new AdminDTO(updatedAdmin);
        updatedAdminDTO.setUserDTO(new UserDTO(updatedAdmin.getUser()));
        return updatedAdminDTO;
    }
}
