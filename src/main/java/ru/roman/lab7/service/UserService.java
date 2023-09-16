package ru.roman.lab7.service;

import ru.roman.lab7.dto.UserDTO;
import ru.roman.lab7.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    User findUserByEmail(String email);

    List<UserDTO> findAllUsers();
}
