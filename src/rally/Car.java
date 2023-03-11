package rally;

public class Car extends Transport<DriverA> {
    @Override
    public void bestLap() {

    }

    @Override
    public void maxSpeed() {

    }

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

    public Car(String brand, String model, double engineVolume, DriverA driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
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
}
