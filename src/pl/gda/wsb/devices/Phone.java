package pl.gda.wsb.devices;

import pl.gda.wsb.CarManufacturers;

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

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", isShattered=" + isShattered +
                ", system='" + system + '\'' +
                '}';
    }
}
