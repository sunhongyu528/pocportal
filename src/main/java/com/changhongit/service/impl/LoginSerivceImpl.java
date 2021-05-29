package com.changhongit.service.impl;

import com.changhongit.entity.User;
import com.changhongit.mapper.UserMapper;
import com.changhongit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSerivceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(User user) {

        return null;
    }
}
