package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class Rectangle extends Figures {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void area() {
        double area = sideA * sideB;
        System.out.println("Rectangle area: " + area);
    }

    @Override
    void perimetr() {
        double perimetr = (sideA + sideB) * 2;
        System.out.println("Rectangle perimetr: " + perimetr);
    }
}
