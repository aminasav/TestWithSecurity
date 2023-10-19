package com.example.testwithsecurity.security;

import com.example.testwithsecurity.entity.UserEntity;
import com.example.testwithsecurity.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    UserRepo userRepo;
    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepo.findByEmail(username)
                .orElseThrow(()->new UsernameNotFoundException("User with email '"+username+"' not found"));
        return UserDetailsImpl.build(user);
    }
}
