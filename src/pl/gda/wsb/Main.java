package pl.gda.wsb;

public class Main {

    public static void main(String[] args)
    {
        Animal Dog = new Animal();
        Dog.age = 3;
        Dog.race = "husky";
        Dog.name = "Barnie";

        Human pracownik = new Human();
        pracownik.age = 22;
        pracownik.firstName = "Jan";
        pracownik.lastName = "Kowalski";
        pracownik.isWorking = true;
        pracownik.position = "Manager";

        Phone mojTelefon = new Phone();
        mojTelefon.isShattered = false;
        mojTelefon.manufacturer = "Samsung";
        mojTelefon.system = "Android";

    }
}
