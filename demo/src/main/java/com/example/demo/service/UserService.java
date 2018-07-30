package com.example.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.model.Benutzer;
import com.example.demo.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService {

    Benutzer findByBenutzername(String benutzername);

    Benutzer save(UserRegistrationDto registration);
}
