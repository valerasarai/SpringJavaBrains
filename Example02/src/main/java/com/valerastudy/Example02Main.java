package com.valerastudy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Example02Main {
    public static void main(String[] args) {

// for refactoring
//        Triangle triangle = new Triangle();
//        triangle.draw();

// for refactoring
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Example02//src//main//resources//spring.xml"));
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();

    }
}
