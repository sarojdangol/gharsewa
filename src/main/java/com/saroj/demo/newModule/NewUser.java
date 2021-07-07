package com.saroj.demo.newModule;

import com.saroj.demo.utils.Roles;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Locale;

@Entity
@Table(name="new_user")

public class NewUser {

//Common
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;

    @Column(unique = true)
    private String username;
    private String password;
    private String firstName;
    private  String lastName;
    @Column(unique = true)
    private String email;
    private String address;
    private Roles roles;
    private boolean verifiedUser;
    private String branch;
    private  String citizenshipNumber;
    
    //Customer specific
    private String customerId;

    //Admin and operator
    private String position;
    private LocalDate joiningDate;
    private int tenure;

    public NewUser() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public boolean isVerifiedUser() {
        return verifiedUser;
    }

    public void setVerifiedUser(boolean verifiedUser) {
        this.verifiedUser = verifiedUser;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
}
