package rally;

public class Servicestation {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Servicestation(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Servicestation{" +
                "name='" + name + '\'' +
                '}';
    }
}
