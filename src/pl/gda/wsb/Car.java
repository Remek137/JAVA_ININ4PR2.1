package pl.gda.wsb;

public class Car {
    final String model;
    final CarManufacturers producer;
    String color;
    int doors;

    public Car(String model, CarManufacturers producer, String color, int doors) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}
