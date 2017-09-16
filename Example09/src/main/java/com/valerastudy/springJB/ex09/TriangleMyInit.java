package com.valerastudy.springJB.ex09;

public class TriangleMyInit {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Triangle[" +
                "pointA=" + pointA.toString() +
                ", pointB=" + pointB.toString() +
                ", pointC=" + pointC.toString() +
                ']');
    }

    private void myInit(){
        System.out.println("My init method called for Triangle.");
    }

    public void cleanUp() throws Exception {
        System.out.println("Bean was been destroyed with myDestroy method!");
    }
}
