package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Animal barnie = new Animal("husky", 3, "Barnie", 30.0, "pies");
        Animal viper = new Animal("snake", 2, "Viper", 10.0, "kot");

        Car car1 = new Car("Prelude", "Honda", "Blue", 3);
        Car car2 = new Car("E class", "MB", "White", 5);

        Human worker = new Human("Jan", "Kowalski", "Manager", 22, true, barnie, car1);
        Human worker1 = new Human("Pawel", "Kowalczyk", "Cleaner", 35, false, viper, car2);

        Phone myPhone = new Phone("Samsung", false, "Android");
        Phone friendsPhone = new Phone("Iphone", true, "iOS");



        System.out.println(barnie);
        System.out.println(worker.firstName);

        if(barnie.getWeight() > viper.getWeight()) System.out.println("Zwierzak o imieniu: " + barnie.name + " jest cięższy i waży: " + barnie.getWeight());
        else System.out.println("Zwierzak o imieniu: " + viper.name + " jest cięższy i waży: " + viper.getWeight());

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(worker);
        humansList.add(worker1);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }
        System.out.println(barnie.getWeight());

        for(int i=0;i<=30;i++) {
            barnie.takeForAWalk();
        }

        for(int i=0;i<=10;i++) {
            viper.takeForAWalk();
        }

        System.out.println(worker.car.model);
        System.out.println(worker1.car.doors);
    }
}
