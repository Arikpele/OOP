package Transport;

public class DriverD extends Driver{
    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории D" + getName()+"начал движения");

    }

    @Override
    public void finish() {
        System.out.println("Водитель категории D" + getName()+"закончил движения");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D" + getName()+"заправляет авто");

    }
}
