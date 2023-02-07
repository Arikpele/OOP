import Transport.Auto;
import Transport.Bus;




public class Main {


    public static void main(String[] args) {
     Bus liaz =new Bus("Лиаз",
             "Курсос",
             2015,
             "Россия",
             "Белый",
             150);
        System.out.println(liaz);
        Bus maz=new Bus(
                "Маз",
                "гормашка",
                2020,
                "Россия",
                "Белый",
                120);
        System.out.println(maz);
    }

}