package com.valerastudy.springJB.ex12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example12Main {

    public static void main(String[] args) {
        usageOfRequiredAnnotation();
        usageOfAutowiredAnnotationNoProperty();
        usageOfAutowiredAnnotationByName();
        usageOfQualifierAnnotation();
        usageOfReferenceAnnotation();
        usageOfInitAndDestroyAnnotation();
        usageOfComponentAnnotation();
    }

    private static void usageOfRequiredAnnotation(){
        myDraw("Annotations @Required:",
                "springJB/ex12/spring01.xml");
    }

    private static void usageOfAutowiredAnnotationNoProperty(){
        myDraw("Annotations @Autowired with no property an only one point bean:",
                "springJB/ex12/spring02.xml");
    }

    private static void usageOfAutowiredAnnotationByName(){
        myDraw("Annotations @Autowired by name and multiply point beans: ",
                "springJB/ex12/spring03.xml");
    }

    private static void usageOfQualifierAnnotation(){
        myDraw("Annotations @Qualifier with multiply point beans: ",
                "springJB/ex12/spring04.xml");
    }

    private static void usageOfReferenceAnnotation(){
        myDraw("Annotations @Reference: ",
                "springJB/ex12/spring05.xml");
    }

    private static void usageOfInitAndDestroyAnnotation(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springJB/ex12/spring05.xml");
        context.registerShutdownHook();
        ((Shape) context.getBean("circle1")).draw();
    }

    private static void usageOfComponentAnnotation(){
        System.out.println("Annotations @Component:");
        ((Shape) new ClassPathXmlApplicationContext("springJB/ex12/spring06.xml").getBean("circleComponent")).draw();
    }

    private static void myDraw(String message, String configLocation){
        System.out.println(message);
        ((Shape) new ClassPathXmlApplicationContext(configLocation).getBean("circle")).draw();
    }
}
