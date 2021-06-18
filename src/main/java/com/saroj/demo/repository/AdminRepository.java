package com.saroj.demo.repository;

import com.saroj.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    List<Admin> findByUser_firstName(String firstName);

    List<Admin> findByWorkingShift(String workingShift);
}
