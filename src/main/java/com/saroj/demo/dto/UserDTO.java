package com.saroj.demo.dto;

import com.saroj.demo.model.User;

public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String address;

    public UserDTO() {
    }

    public UserDTO(User user){
        this.id= user.getId();
        this.username=user.getUsername();
        this.password=user.getPassword();
        this.email=user.getEmail();
        this.firstName=user.getFirstName();
        this.lastName=user.getLastName();
        this.address=user.getAddress();

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
}
