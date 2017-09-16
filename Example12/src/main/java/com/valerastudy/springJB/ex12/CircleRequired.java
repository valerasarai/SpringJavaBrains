package com.valerastudy.springJB.ex12;

import org.springframework.beans.factory.annotation.Required;

public class CircleRequired implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Circle[" +
                "center point =" + center.toString() +
                ']');
    }
}
