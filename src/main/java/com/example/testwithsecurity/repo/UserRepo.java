package com.example.testwithsecurity.repo;

import com.example.testwithsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepo extends JpaRepository<UserEntity,Long> {
    public Optional<UserEntity> findByEmail(String email);
}
