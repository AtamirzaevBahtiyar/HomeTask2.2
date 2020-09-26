package com.company;

public class BMW extends Car implements Printable {

    private String model;
    private int quantityOfDoors;

    public BMW(String carBrand, String color, int year, String model, int quantityOfDoors) {
        super(carBrand, color, year);
        this.model = model;
        this.quantityOfDoors = quantityOfDoors;
    }

    public String getModel() {
        return model;
    }

    public int getQuantityOfDoors() {
        return quantityOfDoors;
    }

    @Override
    public void print() {
        System.out.println("Год выпуска: " + super.getYear() + " " + "Марка машины: " + super.getCarBrand() + " " +
                "Цвет машины: " + super.getColor() + " " + "Модель машины: " + model + " " + "Количество дверей: " + quantityOfDoors);

    }
}
