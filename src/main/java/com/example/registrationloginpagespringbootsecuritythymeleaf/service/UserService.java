package com.example.registrationloginpagespringbootsecuritythymeleaf.service;

import com.example.registrationloginpagespringbootsecuritythymeleaf.model.User;

import com.example.registrationloginpagespringbootsecuritythymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
