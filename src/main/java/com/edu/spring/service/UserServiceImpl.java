package com.edu.spring.service;

import com.edu.spring.mapper.UserMapper;
import com.edu.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    @Override
    public User findByUserName(String username) {
        return mapper.findByUsername(username);
    }
}
