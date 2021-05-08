package pl.gda.wsb.devices;

import pl.gda.wsb.CarManufacturers;

public abstract class Device {
    String model;
    CarManufacturers producer;
    int yearOfProduction;

    public Device(String model, CarManufacturers producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }


    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
