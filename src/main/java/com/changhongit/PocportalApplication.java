package com.changhongit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.changhongit.mapper")

public class PocportalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocportalApplication.class, args);
    }

}
