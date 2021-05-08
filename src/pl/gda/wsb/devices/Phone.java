package pl.gda.wsb.devices;

import pl.gda.wsb.CarManufacturers;
import pl.gda.wsb.Human;

public class Phone extends Device {

    String manufacturer;
    boolean isShattered;
    String system;

    public Phone(CarManufacturers producer, String model, int yearOfProduction, String manufacturer, boolean isShattered, String system) {
        super(model, producer, yearOfProduction);
        this.manufacturer = manufacturer;
        this.isShattered = isShattered;
        this.system = system;
    }

    public void turnOn(){
        System.out.println("-------DziałaPhone");
    }

    public void sell(Human seller, Human buyer, Double price){
        if(seller.phone != null){
            System.out.println(seller.getFirstName() + " posiada samochód");
            if(seller.getCash() > price){
                System.out.println(seller.getFirstName() + " posiada wystarczająco gotówki");
                seller.setCash(seller.getCash()-price);
                buyer.setCash(buyer.getCash() + price);
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("Transakcja udana");
            }
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", isShattered=" + isShattered +
                ", system='" + system + '\'' +
                '}';
    }
}
