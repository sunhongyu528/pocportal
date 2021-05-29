package com.changhongit.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVo {
    private Integer id;
    private String usercode;
    private String username;
    private String password;
    private String status;
    private Date createtime;

}
