package Transport;

public class Bus extends Transport{


    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    public String toString() {
        return "Бренд - "+ getBrand()+
                "Модель - " + getModel() +
                "год выпуска - " + getYear()+
                "сборка в " + getCountry() +
                "цвет кузова - " + getColor()+
                "Макс. скорость - " + getMaxSpeed();
    }
}
