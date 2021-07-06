package com.saroj.demo.controller;

import com.saroj.demo.dto.AdminDTO;
import com.saroj.demo.model.Admin;
import com.saroj.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<AdminDTO> getAll(){
        return adminService.findAll();

    }
    @PutMapping
    public AdminDTO update(@RequestBody AdminDTO adminDTO){
        return adminService.updateAdmin(adminDTO);

    }
    @GetMapping("/{id}")
    public AdminDTO findById(@PathVariable int id){
        return adminService.findById(id);

    }
}
