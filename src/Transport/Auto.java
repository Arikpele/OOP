package Transport;

public class Auto {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gear;
    private final String bodyType;
    private String number;
    private final int capacity;
    private boolean summerTyres;
    private Key key;
    private static final String DEFAULT = "default";

    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutAccess;

        public Key(boolean remoteRun, boolean withoutAccess) {
            this.remoteRun = remoteRun;
            this.withoutAccess = withoutAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutAccess() {
            return withoutAccess;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный запуск двигателя"+", " : "без удаленного запуска двигателя") +
                    (withoutAccess ? "бесключевой допуск"+", " : "ключево допуск");
        }
    }


    public Auto(String brand,
                String model,
                int year,
                String country,
                String gear,
                String color,
                double engineVolume,
                String bodyType,
                String number,
                int capacity,
                boolean summerTyres,
                Key key) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";

        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        setGear(gear);
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "седан";
        }
        this.bodyType = bodyType;
        setNumber(number);
        if (capacity <= 0) {
            capacity = 5;
        }
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        setKey(key);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белого";
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            gear = "МКПП";
        }
        this.gear = gear;
    }

    public String getBodyType() {

        return bodyType;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number == null || number.isEmpty()) {
            number = "х000х";
        }
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            new Key(false, false);
        }
        this.key = key;
    }

    public void changeTyres(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            summerTyres = false;

        }
        if (month >= 4 && month <= 10) {
            summerTyres = true;
        }
    }

    public String toString() {
        return "Модель:" + brand + " " + model + "|" + year +
                " год выпуска |" +
                "сборка в " + country + "|" + color +
                " цвет кузова" + "| объем двигателя - " + engineVolume +
                "коробка передач:" + gear + ", " +
                "Тип кузова" + bodyType + ", " +
                "регистрационный номер" + number + ", " +
                "количество мест" + capacity + ", " +
                (summerTyres ? "летняя" : "зимняя") + "резина" + ", " +
                key;

    }

}















































































