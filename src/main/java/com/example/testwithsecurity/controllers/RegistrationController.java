package com.example.testwithsecurity.controllers;

import com.example.testwithsecurity.entity.UserEntity;
import com.example.testwithsecurity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class RegistrationController {
    UserService userService;
    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("user", new UserEntity());
        return "registration";
    }
    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") UserEntity user, Model model){
        userService.saveUser(user);
        return "redirect:/login";
    }
}
