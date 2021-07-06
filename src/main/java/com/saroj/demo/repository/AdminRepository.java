package com.saroj.demo.repository;

import com.saroj.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    List<Admin> findByUser_firstName(String firstName);
    List<Admin> findByWorkingShift(String workingShift);

}
