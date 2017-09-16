package com.valerastudy.springJB.ex12;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class CircleResourceInit implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void initializeCircle(){
        System.out.println("Init of Circle!");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy of Circle!");
    }

    public void draw() {
        System.out.println("Circle[" +
                "center point =" + center.toString() +
                ']');
    }
}
