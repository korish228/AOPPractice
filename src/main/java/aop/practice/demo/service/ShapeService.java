package aop.practice.demo.service;

import aop.practice.demo.model.Circle;
import aop.practice.demo.model.Triangle;

public class ShapeService {
    private Circle circle ;
    private Triangle triangle ;

    public ShapeService(Circle circle, Triangle triangle) {
        this.circle = circle;
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
