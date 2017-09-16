package com.valerastudy.springJB.ex05;

import java.util.List;

public class Triangle {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        System.out.print("Triangle[");
        for (int i = 0; i < points.size(); i++) {
            System.out.print("point " + (i+1) + " =" + points.get(i).toString());
        }
        System.out.println("]");
    }
}
