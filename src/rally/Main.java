package rally;

import exception.TransportTypeException;

import java.util.*;


public class Main {
    public static void main(String[] args) throws TransportTypeException {
        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic<Car> ivanovIvan = new Mechanic<>("Ivanov Ivan", "Sever");
        Mechanic<Car> sidorovSidor = new Mechanic<>("Sidorov Sidor", "Vostok");
        Mechanic<Car> petrovPetr = new Mechanic<>("Petrov Petr", "Zapad");
        Mechanic<Bus> sergeevSergay = new Mechanic<>("Sergeev Sergay", "motor");
        Mechanic<Bus> valentinovValentin = new Mechanic<>("Valentinov Valentin", "Star");
        Mechanic<Bus> alexandrovAlexander = new Mechanic<>("alexandrov Alexander", "Alarm");
        Mechanic<Track> pavlovichPavel = new Mechanic<>("pavlovich Pavel", "Sibir");
        Mechanic<Track> morozovMoroz = new Mechanic<>("morozov Moroz", "Most");
        Mechanic<Track> vladimirovVladimir = new Mechanic<>("vladimirov Vladimir", "Moscow");
        mechanics.add(ivanovIvan);
        mechanics.add(sidorovSidor);
        mechanics.add(petrovPetr);
        mechanics.add(sergeevSergay);
        mechanics.add(valentinovValentin);
        mechanics.add(alexandrovAlexander);
        mechanics.add(pavlovichPavel);
        mechanics.add(morozovMoroz);
        mechanics.add(vladimirovVladimir);


        DriverA john = new DriverA("John", true, 5);
        DriverB smith = new DriverB("Smith", true, 10);
        DriverC alex = new DriverC("Alex", true, 7);
        List<Driver> drivers = new ArrayList<>();
        drivers.add(john);
        drivers.add(smith);
        drivers.add(alex);

        List<Transport> transports = new ArrayList<>();
        Car lada = new Car("Lada", "Granta", 1.6, john, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john, Car.BodyType.MINIVAN);
        Car bmw = new Car("BMW", "Z8", 4, john, Car.BodyType.SEDAN);
        Car lexus = new Car("Lexus", "IS 350", 3.5, john, Car.BodyType.SUV);

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5, alex);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex);

        Track gazel = new Track("Газель", "Урал", 3, smith);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith);
        Track fiat = new Track("Fiat", "Drive", 5, smith);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith);

        transports.add(lada);
        transports.add(audi);
        transports.add(bmw);
        transports.add(lexus);
        transports.add(gaz);
        transports.add(mercedes);
        transports.add(volkswagen);
        transports.add(ford);
        transports.add(gazel);
        transports.add(volvo);
        transports.add(fiat);
        transports.add(hyundai);


        lada.setMechanics(ivanovIvan);
        audi.setMechanics(sergeevSergay);
        bmw.setMechanics(sidorovSidor);
        lexus.setMechanics(petrovPetr);
        gaz.setMechanics(pavlovichPavel);
        mercedes.setMechanics(pavlovichPavel);
        volkswagen.setMechanics(morozovMoroz);
        ford.setMechanics(valentinovValentin);
        gazel.setMechanics(vladimirovVladimir);
        volvo.setMechanics(ivanovIvan);
        fiat.setMechanics(sergeevSergay);
        hyundai.setMechanics(sidorovSidor);


        Map<Transport, List<Mechanic>> map = new HashMap<>();
        for (Transport transport : transports) {
            map.put(transport, transport.getMechanics());
        }
        for (List<Mechanic> value : map.values()) {
            System.out.println(value);
        }


//
//        Set<Driver> driverSet = new HashSet<>();
//        for (Driver driver : drivers) {
//            driverSet.add(driver);
//        }
//        Iterator<Driver> iterator= driverSet.iterator();
//        while (iterator.hasNext()) {
//            Driver driver = iterator.next();
//            System.out.println(driver);
//        }
//    }


//    public static void driverAnnounce(Transport<?> transport) {
//        System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
//    }
    }
}