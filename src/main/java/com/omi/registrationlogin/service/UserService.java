package com.omi.registrationlogin.service;

import com.omi.registrationlogin.dto.UserDto;
import com.omi.registrationlogin.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}