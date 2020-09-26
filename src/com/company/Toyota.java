package com.company;

public class Toyota extends Car implements Printable{

    private String model;
    private String steeringPosition;

    public Toyota(String carBrand, String color, int year, String model, String steeringPosition) {
        super(carBrand, color, year);
        this.model = model;
        this.steeringPosition = steeringPosition;
    }

    public String getModel() {
        return model;
    }

    public String getSteeringPosition() {
        return steeringPosition;
    }

    @Override
    public void print() {
        System.out.println("Год выпуска: " + super.getYear() + " " + "Марка машины: " + super.getCarBrand() + " " +
                "Цвет машины: " + super.getColor() + " " + "Модель машины: " + model + " " + "Положение руля: " + steeringPosition);

    }
}
