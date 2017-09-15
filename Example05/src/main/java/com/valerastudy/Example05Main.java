package com.valerastudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example05Main {

    public static void main(String[] args) {
        crateObjectThatHaveObjectList();
    }

    private static void crateObjectThatHaveObjectList(){
        System.out.println("Create object that have object list fields: ");
        ((Triangle) getContext("spring01.xml").getBean("triangle")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
