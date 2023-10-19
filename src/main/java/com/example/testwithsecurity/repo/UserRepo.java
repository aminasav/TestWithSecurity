package com.example.testwithsecurity.repo;

import com.example.testwithsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<UserEntity,Long> {
}
