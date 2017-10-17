package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class Square extends Figures {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        double area = side * side;
        System.out.println("Square area: " + area);
    }

    @Override
    void perimetr() {
        double perimetr = 0;
        for (int i = 0; i < 4; i++)
            perimetr = side + perimetr;
     System.out.println("Square perimetr: " + perimetr);
    }

}
