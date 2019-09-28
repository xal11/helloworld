package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloworldApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }
    /**
     * springboot项目打成war包部署到tomcat时需要改变启动方式，否则运行tomcat时war包只会解压，但是加载不了
     * SpringBoot启动类继承SpringBootServletInitializer方法，并重写configure方法
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(HelloworldApplication.class);
    }
}
