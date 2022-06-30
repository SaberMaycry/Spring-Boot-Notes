package com.wj.springSecurityOathu2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wj.springSecurityOathu2.reposity")
public class SpringsecurityOathu2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityOathu2Application.class, args);
    }

}
