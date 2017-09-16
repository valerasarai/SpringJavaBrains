package com.valerastudy.springJB.ex13;

public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Circle[" +
                "center point =" + center.toString() +
                ']');
    }
}
