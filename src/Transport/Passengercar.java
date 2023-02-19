package Transport;

public class Passengercar extends Transport {

    public Passengercar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {


    }

    public void bestCircle() {
        int minBound = 70;
        int maxBound = 150;
        int bestTime = (int) ((maxBound - minBound) * 80 + Math.random());
        System.out.println("Лучшее время для автомобиля - " + bestTime);
    }

    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) ((maxBound - minBound) * 80 + Math.random());
        System.out.println("Максимальная скорость для автомобиля - " + maxSpeed);

    }
}
