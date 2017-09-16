package com.valerastudy.springJB.ex13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CircleMultiMessage implements Shape {
    private Point center;
    @Autowired
    private MessageSource messageSource;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointC")
    public void setCenter(Point center) {
        this.center = center;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void draw() {
        System.out.println(this.messageSource.getMessage(
                "drawing.circle",
                null,
                "Default Drawing Message ",
                null));
        System.out.println(this.messageSource.getMessage(
                "drawing.point",
                new Object[]{center.toString()},
                "Not found Center!",
                null));
    }
}
