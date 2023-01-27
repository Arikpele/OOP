public class Auto {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Auto(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        this.model = model;
    }

    public String toString() {
        return "ID: | Модель:" + brand + " " + model + "|" + year + " год выпуска |" + "сборка в " + country + "|" + color + " цвет кузова" + "| объем двигателя - " + engineVolume;
    }
}
