package com.valerastudy.springJB.ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example07Main {

    public static void main(String[] args) {
        initClasUsingAwareAppCont();
    }

    private static void initClasUsingAwareAppCont(){
        System.out.println("Create object that have object fields (Dependency Injection): ");
        ((Triangle) getContext("springJB/ex07/spring01.xml").getBean("triangle")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
