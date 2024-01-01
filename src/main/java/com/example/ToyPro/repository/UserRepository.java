package com.example.ToyPro.repository;

import com.example.ToyPro.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
