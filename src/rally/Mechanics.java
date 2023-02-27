package rally;

import java.util.ArrayList;
import java.util.List;


public class Mechanics<T extends Transport> {
    private final String name;
    private final String company;
    private final List<T> mechanics;

    public Mechanics(String name, String company) {
        this.name = name;
        this.company = company;
        this.mechanics = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void doService(T car) {
        mechanics.add(car);
        System.out.println("Механик " + getName() +
                " приступает к обслуживанию ТС: " + car.getBrand() +
                " " + car.getModel());
    }

    public void fixCar(T car) {
        mechanics.add(car);
        System.out.println("Механик " + getName() +
                " Ремонту ТС: " + car.getBrand() +
                " " + car.getModel());
    }

    public void listMechanis() {
        for (int i = 0; i < mechanics.size(); i++) {
            System.out.println(mechanics.get(i));
        }
    }
}