package com.valerastudy.springJB.ex09;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example09Main {

    public static void main(String[] args) {
        lifecycleCallback();
        lifecycleCallbackMyInit();
        lifecycleCallbackMyInitDefault();
    }

    private static void lifecycleCallback(){
        System.out.println("Create object using Abstract Application Context: ");
        AbstractApplicationContext context = getContext("springJB/ex09/spring01.xml");
        context.registerShutdownHook();
        ((Triangle) context.getBean("triangle")).draw();
    }

    private static void lifecycleCallbackMyInit(){
        System.out.println("Create object using Abstract Application Context with MyInit method: ");
        AbstractApplicationContext context = getContext("springJB/ex09/spring02.xml");
        context.registerShutdownHook();
        ((TriangleMyInit) context.getBean("triangle")).draw();
    }

    private static void lifecycleCallbackMyInitDefault(){
        System.out.println("Create object using Abstract Application Context with MyInit as default method: ");
        AbstractApplicationContext context = getContext("springJB/ex09/spring03.xml");
        context.registerShutdownHook();
        ((TriangleMyInit) context.getBean("triangle")).draw();
    }

    private static AbstractApplicationContext getContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }
}
