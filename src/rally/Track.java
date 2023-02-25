package rally;

public class Track extends Transport<DriverB> {
    public enum BodyType {
        N1(null, 3.5f),
        N2(3.5f, 12.0f),
        N3(12.f, null);

        private final Float lowBound;
        private final Float topBound;


        BodyType(Float lowBound, Float topBound) {
            this.lowBound = lowBound;
            this.topBound = topBound;
        }


        @Override
        public String toString() {
            return String.format("Грузоподъемность:%s %s", (lowBound != null ? "от " + lowBound + " тонн" : ""),
                    topBound != null ? "до " + topBound + " тонн" : "");

        }
    }

    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Track(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
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
        int maxBound = 13;
        int minBound = 8;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 110;
        int minBound = 160;
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
        System.out.println("пройди диагностику");
    }
}