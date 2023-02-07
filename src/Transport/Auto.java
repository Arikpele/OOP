package Transport;

public class Auto extends Transport {

    private double engineVolume;


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


    public Auto(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String gear, String bodyType, String number, int capacity, boolean summerTyres, Key key) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.gear = gear;
        this.bodyType = bodyType;
        this.number = number;
        this.capacity = capacity;
        this.summerTyres = summerTyres;
        this.key = key;
        {



            setEngineVolume(engineVolume);
            setGear(gear);
            if (bodyType == null || bodyType.isEmpty()) {
                bodyType = "седан";
            }
            setNumber(number);
            if (capacity <= 0) {
                capacity = 5;
            }

            this.summerTyres = summerTyres;
            setKey(key);

        }
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
        return "Модель:" + " |" +
                " год выпуска |" +
                "сборка в " + "|" +
                " цвет кузова" + "| объем двигателя - " + engineVolume +
                "коробка передач:" + gear + ", " +
                "Тип кузова" + bodyType + ", " +
                "регистрационный номер" + number + ", " +
                "количество мест" + capacity + ", " +
                (summerTyres ? "летняя" : "зимняя") + "резина" + ", " +
                key;

    }

}















































































