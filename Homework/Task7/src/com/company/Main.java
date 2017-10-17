package com.company;

public class Main {

    public static void main(String[] args) {
       Triangle triangle = new Triangle(2,3,4);
       Square square = new Square(2);
       Rectangle rectangle = new Rectangle(2,4);
       Ellipse ellipse = new Ellipse(2,8);
       Circle circle = new Circle(5);
       Figures [] figures = {triangle, square, rectangle, ellipse, circle};
        for (int i = 0; i < figures.length; i++){
            figures[i].area();
            figures[i].perimetr();
        }
    }
}
