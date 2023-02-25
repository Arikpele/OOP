package rally;

import exception.TransportTypeException;

public class Main {
    public static void main(String[] args) throws TransportTypeException {

        DriverA john = new DriverA("John", true, 5);
        DriverB smith = new DriverB("Smith", true, 10);
        DriverC alex = new DriverC("Alex", true, 7);

        Car lada = new Car("Lada", "Granta", 1.6, john, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john, Car.BodyType.MINIVAN);
        Car bmw = new Car("BMW", "Z8", 4, john, Car.BodyType.SEDAN);
        Car lexus = new Car("Lexus", "IS 350", 3.5, john, Car.BodyType.SUV);

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex, Bus.BodyType.VERYSMALL);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex, Bus.BodyType.SMALL);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5, alex, Bus.BodyType.BIG);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex, Bus.BodyType.VERYBIG);

        Track gazel = new Track("Газель", "Урал", 3, smith, Track.BodyType.N1);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith, Track.BodyType.N2);
        Track fiat = new Track("Fiat", "Drive", 5, smith, Track.BodyType.N3);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith, Track.BodyType.N1);

        lada.testCar();
     //   driverAnnounce(bmw);
      //  driverAnnounce(gazel);
        gazel.testCar();
        gaz.testCar();
    }




       public static void driverAnnounce(Transport<?> transport) {
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }


}