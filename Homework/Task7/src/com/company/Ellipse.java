package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class Ellipse extends Figures {
    private double semiaxisA;
    private double semiaxisB;

    public Ellipse(double semiaxisA, double semiaxisB) {
        this.semiaxisA = semiaxisA;
        this.semiaxisB = semiaxisB;
    }

    @Override
    void area() {
        double area = Math.PI * semiaxisA * semiaxisB;
        System.out.println("Ellipse area: " + area);
    }

    @Override
    void perimetr() {
        double d = (Math.pow(semiaxisA,2) + Math.pow(semiaxisB, 2)) / 2;
        double perimetr = 2 * Math.PI * Math.sqrt(d);
        System.out.println("Ellipse perimetr: " + perimetr);
    }
}
