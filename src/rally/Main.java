package rally;

import exception.TransportTypeException;


public class Main {
    public static void main(String[] args) throws TransportTypeException {
        Mechanic<Car> ivanovIvan = new Mechanic<>("Ivanov Ivan", "Sever");
        Mechanic<Car> sidorovSidor = new Mechanic<>("Sidorov Sidor", "Vostok");
        Mechanic<Car> petrovPetr = new Mechanic<>("Petrov Petr", "Zapad");
        Mechanic<Bus> sergeevSergay = new Mechanic<>("Sergeev Sergay", "motor");
        Mechanic<Bus> valentinovValentin = new Mechanic<>("Valentinov Valentin", "Star");
        Mechanic<Bus> alexandrovAlexander = new Mechanic<>("alexandrov Alexander", "Alarm");
        Mechanic<Track> pavlovichPavel = new Mechanic<>("pavlovich Pavel", "Sibir");
        Mechanic<Track> morozovMoroz = new Mechanic<>("morozov Moroz", "Most");
        Mechanic<Track> vladimirovVladimir = new Mechanic<>("vladimirov Vladimir", "Moscow");


        ListCars cars = new ListCars();
        DriverA john = new DriverA("John", true, 5);
        DriverB smith = new DriverB("Smith", true, 10);
        DriverC alex = new DriverC("Alex", true, 7);

        Car lada = new Car("Lada", "Granta", 1.6, john, Car.BodyType.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john, Car.BodyType.MINIVAN);
        Car bmw = new Car("BMW", "Z8", 4, john, Car.BodyType.SEDAN);
        Car lexus = new Car("Lexus", "IS 350", 3.5, john, Car.BodyType.SUV);

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5,alex);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex);

        Track gazel = new Track("Газель", "Урал", 3,smith);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith);
        Track fiat = new Track("Fiat", "Drive", 5, smith);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith);

        //  lada.testCar();
        //   driverAnnounce(bmw);
        //  driverAnnounce(gazel);
        //  gazel.testCar();
        //  gaz.testCar();
//        lada.setBodyType(Car.BodyType.HATCHBACK);
//        bmw.setBodyType(Car.BodyType.COUPE);
//        audi.setBodyType(Car.BodyType.MINIVAN);
//        lexus.setBodyType(Car.BodyType.SUV);
//
//        cars.addCar(lada);
//        cars.addCar(audi);
//        cars.addCar(bmw);
//        cars.addCar(lexus);
//        cars.addCar(gaz);
//        cars.addCar(mercedes);
//        cars.addCar(volkswagen);
//        cars.addCar(ford);
//        cars.addCar(gazel);
//        cars.addCar(volvo);
//        cars.addCar(fiat);
//        cars.addCar(hyundai);
        lada.setMechanics(lada,ivanovIvan);
        lada.setMechanics(lada,ivanovIvan);
        mercedes.setMechanics(mercedes,sergeevSergay);
        mercedes.setMechanics(mercedes,sergeevSergay);


    }


    public static void driverAnnounce(Transport<?> transport) {
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }


}