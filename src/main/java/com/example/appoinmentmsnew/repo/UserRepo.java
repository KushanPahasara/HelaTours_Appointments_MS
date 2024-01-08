package com.example.appoinmentmsnew.repo;

import com.example.appoinmentmsnew.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
