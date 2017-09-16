package com.valerastudy.springJB.ex12;

import org.springframework.beans.factory.annotation.Autowired;

public class CircleAutowired implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Circle[" +
                "center point =" + center.toString() +
                ']');
    }
}
