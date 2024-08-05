package com.auth.AuthApi_1.repository;

import com.auth.AuthApi_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
