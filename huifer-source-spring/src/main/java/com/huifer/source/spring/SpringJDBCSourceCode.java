package com.huifer.source.spring;

import com.huifer.source.spring.dao.impl.HsLogDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class SpringJDBCSourceCode {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("JDBC-demo.xml");
        HsLogDaoImpl bean = applicationContext.getBean(HsLogDaoImpl.class);
        System.out.println(bean.findAll());



    }
}
