package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Animal barnie = new Animal("husky", 3, "Barnie", 30.0, "pies");
        Animal viper = new Animal("snake", 2, "Viper", 10.0, "kot");

        Human worker = new Human("Jan", "Kowalski", "Manager", 22, true, barnie);
        Human worker1 = new Human("Pawel", "Kowalczyk", "Cleaner", 35, false, viper);

        Phone myPhone = new Phone("Samsung", false, "Android");
        Phone friendsPhone = new Phone("Iphone", true, "iOS");

        System.out.println(barnie);
        System.out.println(worker.firstName);

        if(barnie.weight > viper.weight) System.out.println("Zwierzak o imieniu: " + barnie.name + " jest cięższy i waży: " + barnie.weight);
        else System.out.println("Zwierzak o imieniu: " + viper.name + " jest cięższy i waży: " + viper.weight);

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(worker);
        humansList.add(worker1);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }

        for(int i=0;i<=40;i++) {
            barnie.takeForAWalk();
        }
    }
}
