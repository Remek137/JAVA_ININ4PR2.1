package pl.gda.wsb;

public class Car {
    final String model;
    final String producer;
    String color;
    int doors;

    public Car(String model, String producer, String color, int doors) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.doors = doors;
    }
}
