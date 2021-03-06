package com.saroj.demo.model;

import com.saroj.demo.dto.AdminDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "admin")
public class Admin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String workingShift;
    private LocalDate joiningDate;
    private String branch;
    private String position;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Admin() {

    }
    public Admin(AdminDTO adminDTO){
        this.id=adminDTO.getId();
        this.workingShift=adminDTO.getWorkingShift();
        this.joiningDate=adminDTO.getJoiningDate();
        this.branch=adminDTO.getBranch();
        this.position=adminDTO.getPosition();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}

