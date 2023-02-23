package rally;

public class Bus extends Transport<DriverC> {
    public enum BodyType {
        VERYSMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        BIG(60, 80),
        VERYBIG(100, 120);

        private final Integer lowbound;
        private final Integer topBound;

        BodyType(Integer lowbound, Integer topBound) {
            this.lowbound = lowbound;
            this.topBound = topBound;
        }

        @Override
        public String toString() {
            return String.format("Вместимость: %s %s", (lowbound != null
                            ? "от " + lowbound + "мест" : ""),
                    topBound != null ? "до " + topBound + "мест" : "");
        }
    }

    private BodyType bodyType;

    public Bus(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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
}
