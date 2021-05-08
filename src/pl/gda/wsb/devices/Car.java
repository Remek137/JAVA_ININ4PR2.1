package pl.gda.wsb.devices;

import pl.gda.wsb.CarManufacturers;

public class Car extends Device {
    String color;
    int doors;
    private Double worth;

    public Car(String model, CarManufacturers producer, int yearOfProduction,String color, int doors, Double worth) {
        super(model, producer, yearOfProduction);
        this.color = color;
        this.doors = doors;
        this.worth = worth;
    }

    public void turnOn(){
        System.out.println("--------DziałaCar");
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getWorth() {
        return worth;
    }

    public void setWorth(Double worth) {
        this.worth = worth;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", worth=" + worth +
                '}';
    }
}
