import java.util.Arrays;

public class Main {

    public static final Auto[] auto =
            {
                    new Auto("Lada", "Granta", 2015, "Россия", "желтого", 1.7),
                    new Auto("Audi", "A8 50l TDI quattro", 2020, "Германия", "черный", 3.0),
                    new Auto("BMW", "Z8", 2021, "Германия", "черного", 3.0),
                    new Auto("KIA", "Sportage 4-го поколения", 2018, "Южная корея", "красный", 2.4),
                    new Auto("Hyundai ", "Avante", 2016, "Южная корея", "Оранжевый", 1.6)
            };

    public static void printAuto() {
        Arrays.stream(auto).forEach(System.out::println);
    }


    public static void main(String[] args) {
        printAuto();
    }
}