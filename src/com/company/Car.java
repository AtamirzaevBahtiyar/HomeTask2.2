package com.company;

public class Car {

    private String carBrand;
    private String color;
    private int year;

    public Car(String carBrand, String color, int year) {
        this.carBrand = carBrand;
        this.color = color;
        this.year = year;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
