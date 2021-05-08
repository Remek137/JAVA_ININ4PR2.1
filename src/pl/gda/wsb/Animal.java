package pl.gda.wsb;

public class Animal implements Salleable {

    static boolean isAlive = true;
    String race;
    int age;
    String name;
    private Double weight;
    final String species;

    public Animal(String race, int age, String name, Double weight, final String species) {
        this.race = race;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.species = species;
        if(species == "pies") this.weight = 25.0;
        else if(species == "kot") this.weight = 5.0;
    }

    public Double getWeight() {
        return weight;
    }

    void feed(){
        if(this.weight>0){
        this.weight++;
        }
        else System.out.println("Zwierzak " + this.name + " umarł!");
    }

    void takeForAWalk(){
        if(this.weight>0){
            this.weight--;
        }
        else System.out.println("Zwierzak " + this.name + " umarł!");
    }

    public void sell(Human seller, Human buyer, Double price){
        if(seller.pet != null){
            System.out.println(seller.firstName + " posiada zwierzę");
            if(seller.cash > price){
                System.out.println(seller.firstName + " posiada wystarczająco gotówki");
                seller.cash -= price;
                buyer.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("Transakcja udana");
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "race='" + race + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}
