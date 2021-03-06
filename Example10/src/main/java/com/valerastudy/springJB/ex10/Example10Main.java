package com.valerastudy.springJB.ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example10Main {

    public static void main(String[] args) {
        displayBeanPostProcessor();
        displayBeanFactoryPostProcessor();
        initBeanFromFile();
    }

    private static void displayBeanPostProcessor(){
        System.out.println("Do something before and post init (BeanPostProcessor): ");
        ((Triangle) getContext("springJB/ex10/spring01.xml").getBean("triangle")).draw();
    }

    private static void displayBeanFactoryPostProcessor(){
        System.out.println("Do something post init a factory (BeanFactoryPostProcessor): ");
        ((Triangle) getContext("springJB/ex10/spring02.xml").getBean("triangle")).draw();
    }

    private static void initBeanFromFile(){
        System.out.println("Init Bean parameters from a file before it loading: ");
        ((Triangle) getContext("springJB/ex10/spring03.xml").getBean("triangle")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
