package com.wby.edu.service.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 指定扫描的基本包
 * @ComponentScan(basePackages = {"com.wby.edu"})
 *      扫描controllerAdvice,controller,service,respsitory,configuration,component
 * @MapperScan(basePackages = "com.wby.edu.service.*.mapper")
 *      扫描mybatis的mapper
 * @ServletComponentScan
 *      扫描tomcat的三大组件：@webServlet，@WebFilter，@WebListener
 */
@SpringBootApplication

@ComponentScan(basePackages = {"com.wby.edu"})//扫描controllerAdvice,controller,service,respsitory,configuration,component
//@MapperScan(basePackages = "com.wby.edu.service.*.mapper") 通过mybatis配置类全局扫描
public class ServiceTeacherApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceTeacherApplication.class,args);
    }
}
