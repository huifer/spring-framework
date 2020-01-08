package com.huifer.source.spring;

import com.huifer.source.spring.bean.UserXtd;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XSDDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("XTD-xml.xml");
        UserXtd user = (UserXtd) applicationContext.getBean("testUserBean");
        System.out.println(user.getEmailAddress());
    }
}
