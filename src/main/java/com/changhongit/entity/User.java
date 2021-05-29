package com.changhongit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String usercode;
    private String username;
    private String password;
    private String status;
    private Date createtime;

}
