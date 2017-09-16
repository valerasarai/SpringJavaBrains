package com.valerastudy.springJB.ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example11Main {

    public static void main(String[] args) {
        defaultInitObjects();
        defaultInitObjectsUsingInterface();
    }

    private static void defaultInitObjects(){
        System.out.println("Default init and inject the objects via SPRING: ");
        ((Triangle) getContext("springJB/ex11/spring01.xml").getBean("triangle")).draw();
        ((Circle) getContext("springJB/ex11/spring01.xml").getBean("circle")).draw();
    }

    private static void defaultInitObjectsUsingInterface(){
        System.out.println("Init and inject the objects via SPRING using interfaces: ");
        ((Shape) getContext("springJB/ex11/spring01.xml").getBean("triangle")).draw();
        ((Shape) getContext("springJB/ex11/spring01.xml").getBean("circle")).draw();
    }
    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
