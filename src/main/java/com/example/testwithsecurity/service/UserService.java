package com.example.testwithsecurity.service;

import com.example.testwithsecurity.entity.UserEntity;
import com.example.testwithsecurity.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    UserRepo userRepo;
    private BCryptPasswordEncoder encoder(){return new BCryptPasswordEncoder();}
    public void saveUser(UserEntity user){
        user.setPassword(encoder().encode(user.getPassword()));
        userRepo.save(user);
    }
}
