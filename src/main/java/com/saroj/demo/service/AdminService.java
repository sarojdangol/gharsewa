package com.saroj.demo.service;

import com.saroj.demo.dto.AdminDTO;
import com.saroj.demo.model.Admin;

import java.util.List;

public interface AdminService {

    List<AdminDTO> findAll();
    AdminDTO findById(int id);
    Admin addAdmin(Admin admin);
    AdminDTO updateAdmin(AdminDTO adminDTO);

}
