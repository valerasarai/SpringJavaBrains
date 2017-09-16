package com.valerastudy.springJB.ex13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example13Main {

    public static void main(String[] args) {
        showMessageUsingSpring();
        showMessageUsingSpringFromClass();
        showMoreMessages();
    }

    private static void showMessageUsingSpring(){
        System.out.println("Get a message using Application Context Object:");
        ApplicationContext context = getContext("springJB/ex13/spring01.xml");
        System.out.println(context.getMessage("greeting",null, "Default Greeting",null));
    }

    private static void showMessageUsingSpringFromClass(){
        myDraw("Get a message in injected class from the bean:",
                "springJB/ex13/spring02.xml");
    }

    private static void showMoreMessages(){
        myDraw("Get more messages:",
                "springJB/ex13/spring03.xml");
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }

    private static void myDraw(String message, String configLocation){
        System.out.println(message);
        ((Shape) getContext(configLocation).getBean("circle")).draw();
    }
}
