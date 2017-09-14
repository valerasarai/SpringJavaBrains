package com.valerastudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example04Main {

    public static void main(String[] args) {
        crateObjectThatHaveObjectFields();
        crateObjectThatHaveObjectFieldsInnerBean();
        createObjectUsingAlias();
    }

    private static void crateObjectThatHaveObjectFields(){
        System.out.println("Create object that have object fields (Dependency Injection): ");
        ((Triangle) getContext("spring01.xml").getBean("triangle")).draw();
    }

    private static void crateObjectThatHaveObjectFieldsInnerBean(){
        System.out.println("Create object that have object fields (Dependency Injection) inner bean: ");
        ((Triangle) getContext("spring02.xml").getBean("triangle")).draw();
    }

    private static void createObjectUsingAlias(){
        System.out.println("Create object using alias: ");
        ApplicationContext context = getContext("spring03.xml");
        ((Triangle) context.getBean("triangle-alias")).draw();
        ((Triangle) context.getBean("triangle-name")).draw();
        ((Triangle) context.getBean("triangle-name-alias")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
