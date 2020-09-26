package com.company;

public class Main {

    public static void main(String[] args) {

        Toyota toyota = (Toyota) createObject(Toyota.class.getSimpleName());
        BMW bmw = (BMW) createObject(BMW.class.getSimpleName());
        Mazda mazda = (Mazda) createObject(Mazda.class.getSimpleName());
        toyota.print();
        bmw.print();
        mazda.print();
    }
    public static Car createObject (String className){
      Car car = null;

      switch (className){
          case "Toyota":
              car = new Toyota("Toyota","White",2002,"Aristo","Right");
              break;
          case "BMW":
              car = new BMW("BMW","Black",2005,"X-5",5);
              break;
          case "Mazda":
              car = new Mazda("Mazda","Blue",2000,"Atenza",3);
              break;
          default:
              System.out.println("Такой машины нет");

      } return car;

    }

}
