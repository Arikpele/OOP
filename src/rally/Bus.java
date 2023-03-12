package rally;

import exception.TransportTypeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Bus(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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


    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    public void testCar() {
        System.out.println("Автобусы диагностику проходить не должны");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Objects.equals(bodyType, bus.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}
