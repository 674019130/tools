package com.su.mtools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.su.mtools.mvc.mapper"})
public class MToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MToolsApplication.class, args);
    }

}
