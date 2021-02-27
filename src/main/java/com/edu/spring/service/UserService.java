package com.edu.spring.service;

import com.edu.spring.model.User;

public interface UserService {

    User findByUserName(String username);
}
