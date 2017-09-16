package com.valerastudy.springJB.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Example02Main {
    public static void main(String[] args) {
        drawTriangleWithObjectFactory();
        drawTriangleWithSpring();
        drawTriangleWithApplicationContext();
    }

    private static void drawTriangleWithObjectFactory() {
        System.out.println("Instantiate the object triangle using Object Factory: ");
        Triangle triangle = new Triangle();
        triangle.draw();
    }

    private static void drawTriangleWithSpring() {
        System.out.println("Instantiate the object triangle using SPRING and Beam Factory: ");
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Example02//src//main//resources//springJB//ex02//spring.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();
    }

    private static void drawTriangleWithApplicationContext() {
        System.out.println("Instantiate the object triangle using SPRING and Application Context: ");
        ApplicationContext context = new ClassPathXmlApplicationContext("springJB/ex02/spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
