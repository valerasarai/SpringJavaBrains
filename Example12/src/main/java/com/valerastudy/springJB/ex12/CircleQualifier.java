package com.valerastudy.springJB.ex12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CircleQualifier implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier ("circleRelated")
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Circle[" +
                "center point =" + center.toString() +
                ']');
    }
}
