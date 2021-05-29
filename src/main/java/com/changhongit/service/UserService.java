package com.changhongit.service;

import com.changhongit.vo.DataVo;
import com.changhongit.vo.UserVo;

public interface UserService {
    public DataVo<UserVo> findData(Integer page,Integer limit);


}