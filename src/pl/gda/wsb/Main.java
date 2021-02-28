package pl.gda.wsb;

public class Main {

    public static void main(String[] args)
    {
        Animal barnie = new Animal("husky", 3, "Barnie");
        Animal viper = new Animal("snake", 2, "Viper");

        Human worker = new Human("Jan", "Kowalski", "Manager", 22, true);
        Human worker1 = new Human("Pawel", "Kowalczyk", "Cleaner", 35, false);

        Phone myPhone = new Phone("Samsung", false, "Android");
        Phone friendsPhone = new Phone("Iphone", true, "iOS");

        System.out.println(barnie);
        System.out.println(worker.firstName);
    }
}
