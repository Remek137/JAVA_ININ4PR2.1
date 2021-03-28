package pl.gda.wsb;

public class Human {

    String firstName;
    String lastName;
    String position;
    int age;
    boolean isWorking;
    Animal pet;
    Car car;

    public Human(String firstName, String lastName, String position, int age, boolean isWorking, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.isWorking = isWorking;
        this.pet = pet;
        this.car = car;
    }
}
