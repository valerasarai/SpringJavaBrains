package com.valerastudy.springJB.ex14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example14Main {

    public static void main(String[] args) {
        showMyEventListener();
    }

    private static void showMyEventListener(){
        myDraw("Get message from MyEventListener Class:",
                "springJB/ex14/spring01.xml");
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }

    private static void myDraw(String message, String configLocation){
        System.out.println(message);
        ((Shape) getContext(configLocation).getBean("circle")).draw();
    }
}
