package rally;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport<DriverA> {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String settingBody;

        BodyType(String settingBody) {
            this.settingBody = settingBody;
        }

        @Override
        public String toString() {
            return "BodyType{" +
                    "settingBody='" + settingBody + '\'' +
                    '}';
        }
    }

    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineVolume, DriverA driver, BodyType bodyType, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.bodyType = bodyType;
    }

    @Override
    public void startCar() {
        super.startCar();
    }

    public void stopCar() {
        super.stopCar();
    }

    @Override
    public void pitStop() {
        super.pitStop();
    }

    @Override
    public void bestLap() {
        int maxBound = 8;
        int minBound = 3;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 250;
        int minBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }

    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }




    public void testCar() {
        System.out.println("Пройти диагностику");
    }
    List<Servicestation> list=new ArrayList<>();

}
