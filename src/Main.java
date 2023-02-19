import Transport.Auto;
import Transport.Bus;
import Transport.DriverB;
import Transport.Trucks;


public class Main {


    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB=new DriverB(

            )
            Bus liaz =new Bus("Лиаз",
                    "Курсос",
                    3.0
                   );
            System.out.println(liaz);
        }

        Auto lada=new Auto(
                "Лада",
                "Самара",
                1.5
               );
        System.out.println(lada);

        Trucks kamaz =new Trucks(
                "Камаз",
                "Мамонт",
                4.0);
        System.out.println(kamaz);
    }

}