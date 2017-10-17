package com.company;
import java.math.*;
/**
 * Created by Дмитрий on 17.10.2017.
 */
public class Triangle extends Figures {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    void area() {
        double p = (sideA + sideB + sideC)/2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        System.out.println("Triangle area: " + area);
    }
    @Override
    void perimetr() {
        double perimetr = sideA + sideB + sideC;
        System.out.println("Triangle perimetr: " + perimetr);
    }
}
