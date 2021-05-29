package com.changhongit.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.changhongit.entity.User;
import com.changhongit.mapper.UserMapper;
import com.changhongit.service.UserService;
import com.changhongit.vo.DataVo;
import com.changhongit.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public DataVo<UserVo> findData(Integer page,Integer limit) {
        DataVo dataVo=new DataVo();
        dataVo.setCode(0);
        dataVo.setMsg("");
        //dataVo.setCount(userMapper.selectCount(null));

        IPage<User> userIPage=new Page<>(page,limit);
        IPage<User> result=userMapper.selectPage(userIPage,null);
        dataVo.setCount((int) result.getTotal());

        //List<User> userList=userMapper.selectList(null);
        List<User> userList=result.getRecords();
        List<UserVo> userVoList=new ArrayList<>();
        for (User user:userList){
            UserVo userVo=new UserVo();
            BeanUtils.copyProperties(user,userVo);
            userVoList.add(userVo);
        }

        dataVo.setData(userVoList);

        return dataVo;
    }
}
