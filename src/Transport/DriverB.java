package Transport;

public class DriverB extends Driver{
    public DriverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории B" + getName()+"начал движения");

    }

    @Override
    public void finish() {
        System.out.println("Водитель категории B" + getName()+"закончил движения");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории B" + getName()+"заправляет авто");

    }

}
