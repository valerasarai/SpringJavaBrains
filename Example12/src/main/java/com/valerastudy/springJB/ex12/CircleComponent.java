package com.valerastudy.springJB.ex12;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CircleComponent implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Circle[" +
                "center point =" + center.toString() +
                ']');
    }
}
