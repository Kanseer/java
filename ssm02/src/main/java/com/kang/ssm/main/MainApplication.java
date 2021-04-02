package com.kang.ssm.main;

import com.kang.ssm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kanseer
 * @create 2021-03-01 17:45
 */
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.findAll().forEach(list-> System.out.println(list));
    }
}
