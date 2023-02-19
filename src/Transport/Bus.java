package Transport;

public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume, Transport.DriverD driver) {
        super(brand, model, engineVolume, driver);
    }
}

    public void startMove() {
        System.out.println("Автобус марки - " + getBrand() + " начал движение");
    }

    public void finishMove() {
        System.out.println("Автобус марки - " + getBrand() + " закончил движение");
    }

   public void pitStop(){

    };

    public void bestCircle(){
        int minBound=100;
        int maxBound=150;
        int bestTime=(int)((maxBound-minBound)* 80+Math.random());
        System.out.println("Лучшее время для автобуса - " + bestTime);
    };

    public void maxSpeed(){
        int minBound=80;
        int maxBound=120;
        int maxSpeed=(int)((maxBound-minBound)* 80+Math.random());
        System.out.println("Максимальная скорость для автобуса - " + maxSpeed);

    };
}
