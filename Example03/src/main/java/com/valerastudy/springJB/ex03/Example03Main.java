package com.valerastudy.springJB.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example03Main {
    public static void main(String[] args) {
        initClassBySetter();
        initClassByConstructorOneParam();
        initClassByConstructorManyParam();
        initClassByConstructorAndParamType();
        initClassByConstructorAndPrperty();
        initClassByConstructorUsingIndex();
    }

    private static void initClassBySetter() {
        System.out.println("Init. class by setter for property: ");
        ((Triangle) getContext("springJB/ex03/spring01.xml").getBean("triangle")).draw();
    }

    private static void initClassByConstructorOneParam() {
        System.out.println("Init. class by constructor one parameter: ");
        ((Triangle) getContext("springJB/ex03/spring02.xml").getBean("triangle")).draw();
    }

    private static void initClassByConstructorManyParam() {
        System.out.println("Init. class by constructor many parameters: ");
        ((Triangle) getContext("springJB/ex03/spring03.xml").getBean("triangle")).draw();
    }

    private static void initClassByConstructorAndParamType() {
        System.out.println("Init. class by constructor parameter type: ");
        ((Triangle) getContext("springJB/ex03/spring04.xml").getBean("triangle")).draw();
    }

    private static void initClassByConstructorAndPrperty() {
        System.out.println("Init. class by constructor mixed with property: ");
        ((Triangle) getContext("springJB/ex03/spring05.xml").getBean("triangle")).draw();
    }

    private static void initClassByConstructorUsingIndex() {
        System.out.println("Init. class by constructor by index: ");
        ((Triangle) getContext("springJB/ex03/spring06.xml").getBean("triangle")).draw();
    }

    private static ApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
