package rally;

import exception.TransportTypeException;
import java.util.ArrayList;
import java.util.List;


public abstract class Transport<T extends Driver> implements Competing {

    private String brand;
    private String model;
    private double engineVolume;
    private T driver;

    private  List<Mechanic> mechanics;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VALUE = 1.5;


    public Transport(String brand, String model, double engineVolume, T driver,Mechanic mechanics) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setDriver(driver);
        setMechanics(mechanics);
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Машины: " +
                "Бренд = " + brand +
                ", модель = " + model +
                ", мощность двигателя = " + engineVolume;
    }

    public void startCar() {
        System.out.println(getBrand() + " " + model + ": начать движение");
    }

    public void stopCar() {
        System.out.println(getBrand() + " " + model + ": закончить движение");
    }

    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    public abstract void printType();

    public abstract void testCar() throws TransportTypeException;

    public void getAllTeam() {
        System.out.println("У транспорта: " + getBrand() +
                " " + getModel() + " за рулем " +
                getDriver() + ", а обслуживает: "+getMechanics());
    }
    public void setMechanics(Mechanic mechanics) {
        this.mechanics.add(mechanics);
    }

}