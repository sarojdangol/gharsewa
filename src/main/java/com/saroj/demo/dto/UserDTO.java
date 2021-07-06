package com.saroj.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.saroj.demo.model.User;
import com.saroj.demo.utils.Roles;

import java.time.LocalDate;

public class UserDTO {
    private int id;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String fullName;
    private Roles roles;

    //for Admin Signup
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String workingShift;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String position;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDate joiningDate;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String branch;


    public UserDTO() {
    }

    public UserDTO(User user){
        this.id= user.getId();
        this.username=user.getUsername();
//        this.password=user.getPassword();
        this.email=user.getEmail();
        this.firstName=user.getFirstName();
        this.lastName=user.getLastName();
        this.address=user.getAddress();
        this.fullName=user.getFirstName() +" " + user.getLastName();
        this.roles=user.getRoles();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getWorkingShift() {
        return workingShift;
    }

    public void setWorkingShift(String workingShift) {
        this.workingShift = workingShift;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
