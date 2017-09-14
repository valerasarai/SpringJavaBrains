package com.valerastudy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Example02Main {
    public static void main(String[] args) {
        drawTriangleWithObjectFactory();
        drawTriangleWithSpring();
    }

    private static void drawTriangleWithObjectFactory() {
        System.out.println("Instantiate the object triangle using Object Factory: ");
        Triangle triangle = new Triangle();
        triangle.draw();
    }

    private static void drawTriangleWithSpring() {
        System.out.println("Instantiate the object triangle using SPRING amd Beam Factory: ");
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Example02//src//main//resources//spring.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();
    }
}
