package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class Circle extends Figures {
private double radiusCircle;

    public Circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    @Override
    void area() {
        double area = radiusCircle * radiusCircle * Math.PI;
        System.out.println("Circle area: " + area);
    }

    @Override
    void perimetr() {
       double twoPi = Math.PI * 2;
        double perimetr = radiusCircle * twoPi;
        System.out.println("Circle perimetr: " + perimetr);
    }
}
