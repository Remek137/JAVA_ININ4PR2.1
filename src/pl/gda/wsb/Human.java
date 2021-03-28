package pl.gda.wsb;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age && isWorking == human.isWorking && Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(position, human.position) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, age, isWorking, pet, car);
    }
}
