package com.project.sr19.service;

import com.project.sr19.dto.UserDto;
import com.project.sr19.model.User;

import java.util.List;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
