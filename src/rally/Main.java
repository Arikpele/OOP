package rally;

import exception.TransportTypeException;

import java.util.List;


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

        Car lada = new Car("Lada", "Granta", 1.6, john, Car.BodyType.SEDAN, ivanovIvan);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john, Car.BodyType.MINIVAN, ivanovIvan);
        Car bmw = new Car("BMW", "Z8", 4, john, Car.BodyType.SEDAN, sidorovSidor);
        Car lexus = new Car("Lexus", "IS 350", 3.5, john, Car.BodyType.SUV, petrovPetr);

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex, Bus.BodyType.VERYSMALL, sergeevSergay);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex, Bus.BodyType.SMALL, sergeevSergay);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5, alex, Bus.BodyType.BIG, valentinovValentin);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex, Bus.BodyType.VERYBIG, alexandrovAlexander);

        Track gazel = new Track("Газель", "Урал", 3, smith, Track.BodyType.N1, petrovPetr);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith, Track.BodyType.N2, pavlovichPavel);
        Track fiat = new Track("Fiat", "Drive", 5, smith, Track.BodyType.N3, morozovMoroz);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith, Track.BodyType.N1, vladimirovVladimir);


        //  lada.testCar();
        //   driverAnnounce(bmw);
        //  driverAnnounce(gazel);
        //  gazel.testCar();
        //  gaz.testCar();


        lada.setBodyType(Car.BodyType.HATCHBACK);
        bmw.setBodyType(Car.BodyType.COUPE);
        audi.setBodyType(Car.BodyType.MINIVAN);
        lexus.setBodyType(Car.BodyType.SUV);

        cars.addCar(lada);
        cars.addCar(audi);
        cars.addCar(bmw);
        cars.addCar(lexus);
        cars.addCar(gaz);
        cars.addCar(mercedes);
        cars.addCar(volkswagen);
        cars.addCar(ford);
        cars.addCar(gazel);
        cars.addCar(volvo);
        cars.addCar(fiat);
        cars.addCar(hyundai);

        // System.out.println("Количество машин в списке - " + cars.getAllTransport().size());


        // System.out.println(lada.getDriver());
        //System.out.println(lada.getMechanics());
        nameDriver(lada);
        nameDriver(mercedes);
        Servicestation<Transport> auto = new <Transport>Servicestation();
        auto.addCar1(lada);
        auto.addCar1(audi);
        auto.addCar1(bmw);
        auto.addCar1(lexus);
        auto.addCar1(gazel);
        auto.addCar1(volvo);
        auto.addCar1(fiat);
        auto.addCar1(hyundai);
        auto.osmotr();


    }


    public static void driverAnnounce(Transport<?> transport) {
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
    }

    public static void nameDriver(Transport<?> transport) {
        System.out.println(transport.getDriver() + "" + transport.getMechanics());
    }
}