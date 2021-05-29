package com.changhongit.vo;



import lombok.Data;

import java.util.List;
@Data
public class DataVo<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;
}
