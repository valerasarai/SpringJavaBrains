package com.valerastudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example11Main {

    public static void main(String[] args) {
        displayBeanPostProcessor();
    }

    private static void displayBeanPostProcessor(){
        System.out.println("Do something before and post init (BeanPostProcessor): ");
        ((Triangle) getContext("spring03.xml").getBean("triangle")).draw();
    }


    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
