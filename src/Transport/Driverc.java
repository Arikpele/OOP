package Transport;

public class Driverc extends Driver{


    public Driverc(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }
    @Override
    public void startMove() {
        System.out.println("Водитель категории C" + getName()+"начал движения");

    }

    @Override
    public void finish() {
        System.out.println("Водитель категории C" + getName()+"закончил движения");

    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C" + getName()+"заправляет авто");

    }
}
