package com.valerastudy.springJB.ex06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example06Main {

    public static void main(String[] args) {
        crateObjectAutowireByName();
        crateObjectAutowireByType();
    }

    private static void crateObjectAutowireByName(){
        System.out.println("Create object Autowire byName: ");
        ((Triangle) getContext("springJB/ex06/spring01.xml").getBean("triangle")).draw();
    }

    private static void crateObjectAutowireByType(){
        System.out.println("Create object Autowire byType: ");
        ((Triangle) getContext("springJB/ex06/spring02.xml").getBean("triangle")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
