package com.company;

public class Mazda extends Car implements Printable{

    private String model;
    private int quantityOfOwners;

    public Mazda(String carBrand, String color, int year, String model, int quantityOfOwners) {
        super(carBrand, color, year);
        this.model = model;
        this.quantityOfOwners = quantityOfOwners;
    }

    public String getModel() {
        return model;
    }

    public int getQuantityOfOwners() {
        return quantityOfOwners;
    }

    @Override
    public void print() {
        System.out.println("Год выпуска: " + super.getYear() + " " + "Марка машины: " + super.getCarBrand() + " "  +
                "Модель машины: " + model + " " + "Количество владельцев: " + quantityOfOwners);

    }
}
