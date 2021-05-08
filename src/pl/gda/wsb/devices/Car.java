package pl.gda.wsb.devices;

import pl.gda.wsb.CarManufacturers;
import pl.gda.wsb.Human;
import pl.gda.wsb.Salleable;

public class Car extends Device implements Salleable {
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

    public void sell(Human seller, Human buyer, Double price){
        if(seller.getCar() != null){
            System.out.println(seller.getFirstName() + " posiada samochód");
            if(seller.getCash() > price){
                System.out.println(seller.getFirstName() + " posiada wystarczająco gotówki");
                seller.setCash(seller.getCash()-price);
                buyer.setCash(buyer.getCash() + price);
                buyer.setCarForce(seller.getCar());
                seller.setCarForce(null);
                System.out.println("Transakcja udana");
            }
        }
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
