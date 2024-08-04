package com.example.ecommerce.services;

import com.example.ecommerce.dtos.UserDTO;
import com.example.ecommerce.exceptions.DataNotFoundException;
import com.example.ecommerce.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;

    String login(String phoneNumber, String password) throws Exception;
}
