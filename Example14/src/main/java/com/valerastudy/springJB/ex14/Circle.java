package com.valerastudy.springJB.ex14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point center;
    private ApplicationEventPublisher publisher;
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
        publisher.publishEvent(new DrawEvent(this));
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
