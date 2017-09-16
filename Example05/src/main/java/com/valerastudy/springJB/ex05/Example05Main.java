package com.valerastudy.springJB.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example05Main {

    public static void main(String[] args) {
        crateObjectThatHaveObjectList();
    }

    private static void crateObjectThatHaveObjectList(){
        System.out.println("Create object that have object list fields: ");
        ((Triangle) getContext("springJB/ex05/spring01.xml").getBean("triangle")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
