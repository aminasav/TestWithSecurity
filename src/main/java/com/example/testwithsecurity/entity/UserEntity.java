package com.example.testwithsecurity.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, message = "Имя должно состоять хотя бы из двух символов")
    private String name;
    @NotNull
    @Email(message = "Неправильно указана почта")
    private String email;
    @NotNull
    @Size(min = 8, message = "Пароль должен содержать 8 символов")
    private String password;
    private Role role = Role.USER;

}
