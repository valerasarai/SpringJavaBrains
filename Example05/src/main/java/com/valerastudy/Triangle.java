package com.valerastudy;

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
        for (Point point : this.points)
        {int i = 1;
            System.out.print("point " + (i++) + " =" + point.toString());
        }
        System.out.println("]");
    }
}
