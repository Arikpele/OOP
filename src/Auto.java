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
        if (brand == null || brand.equals("") || brand.equals(" ")) {
            this.brand = "default";
        }
        if (model==null || model.equals("") || model.equals(" ")) {
            this.model = "default";
        }
        if (country==null|| country.equals("") || country.equals(" ")) {
            this.country = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color==null|| color.equals("") || color.equals(" ")) {
            this.color = "белого";
        }
        if (year <= 0) {
            this.year = 2000;
        }
    }

    public String toString() {
        return "Модель:" + brand + " " + model + "|" + year + " год выпуска |" + "сборка в " + country + "|" + color + " цвет кузова" + "| объем двигателя - " + engineVolume;
    }

}
