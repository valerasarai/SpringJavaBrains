package com.valerastudy.springJB.ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example08Main {

    public static void main(String[] args) {
        initWithInheritance();
        initWithInheritanceList();
    }

    private static void initWithInheritance(){
        System.out.println("Create object using inheritance in been configuration: ");
        ((Triangle) getContext("springJB/ex08/spring01.xml").getBean("triangle1")).draw();
    }

    private static void initWithInheritanceList(){
        System.out.println("Create object using inheritance in been configuration and list of object as field: ");

        //not could be instantiated if it is ABSTRACT
//        ((TrianglePointList) getContext("spring02.xml").getBean("parent_triangle")).draw();

        System.out.println("definition of bean using MERGE: ");
        ((TrianglePointList) getContext("springJB/ex08/spring02.xml").getBean("triangle1")).draw();

        System.out.println("definition of bean without MERGE: ");
        ((TrianglePointList) getContext("springJB/ex08/spring02.xml").getBean("triangle2")).draw();
    }
    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
