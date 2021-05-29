package com.changhongit.service;

import com.changhongit.vo.DataVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    void findData(){
        //DataVo dataVo=userService.findData();
        int i=0;

    }

}