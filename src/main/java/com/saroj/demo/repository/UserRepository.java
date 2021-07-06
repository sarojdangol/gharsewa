package com.saroj.demo.repository;

import com.saroj.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


  //  @Query("Select u from User u where username= :username and password= :password")
    Optional<User> findByUsernameAndPassword(String username, String password);

}
