package rally;


public class Mechanic<T extends Transport> {
    private final String name;
    private final String company;


    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
          }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    public void fixCar(T car) {

        System.out.println("Механик " + getName() +
                " Ремонту ТС: " + car.getBrand() +
                " " + car.getModel());
    }


    }