package com.hbl.sBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
* @SpringBootApplication 来标注一个主程序，说明这是一个Spring Boot应用
* */
//@ImportResource(locations = {"classpath:beans.xml"})
@MapperScan("com.hbl.sBoot.mapper")
@EnableJpaRepositories(basePackages = "com.hbl.sBoot.dao")
@EntityScan("com.hbl.sBoot.entities")
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
