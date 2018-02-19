package com.company.models;

public class Car {
    private int id;
    private String number;
    private String color;
    private String model;
    private Human owner;

    public Car(int id, String number, String color, String model, Human owner) {
        this.id = id;
        this.number = number;
        this.color = color;
        this.model = model;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
