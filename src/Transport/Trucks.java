package Transport;

public class Trucks extends Transport<Driverc> {
    public Trucks(String brand, String model, double engineVolume, Transport.Driverc driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMove() {
        System.out.println("Грузовик марки - " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Грузовик марки - " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {

    }

    public void bestCircle() {
        int minBound = 100;
        int maxBound = 150;
        int bestTime = (int) ((maxBound - minBound) * 80 + Math.random());
        System.out.println("Лучшее время для грузовика - " + bestTime);
    }
    public void maxSpeed(){
        int minBound=80;
        int maxBound=120;
        int maxSpeed=(int)((maxBound-minBound)* 80+Math.random());
        System.out.println("Максимальная скорость для грузовика - " + maxSpeed);

    }
}