package rally;

import exception.TransportTypeException;

import java.util.ArrayList;
import java.util.List;

public class Bus extends Transport<DriverC> {

    public enum BodyType {
        VERYSMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        BIG(60, 80),
        VERYBIG(100, 120);

        private final Integer lowBound;
        private final Integer topBound;

        BodyType(Integer lowBound, Integer topBound) {
            this.lowBound = lowBound;
            this.topBound = topBound;
        }

        @Override
        public String toString() {
            return String.format("Вместимость: %s %s", (lowBound != null
                            ? "от " + lowBound + "мест" : ""),
                    topBound != null ? "до " + topBound + "мест" : "");
        }
    }

    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Bus(String brand, String model, double engineVolume, DriverC driver,  BodyType bodyType,List<Mechanic> mechanics) {
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
    public void bestLap() {
        int maxBound = 15;
        int minBound = 10;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 130;
        int minBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }

    public void pitStop() {
        super.pitStop();
    }

    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    public void testCar() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");

    }
}
