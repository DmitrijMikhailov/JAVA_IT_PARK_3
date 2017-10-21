package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = Car.builderCar()
                .audioSystem("Audio-Technica")
                .bodyColor("Red")
                .powerHp(700.5)
                .buildCar();
    }
}
