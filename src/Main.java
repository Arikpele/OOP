import Transport.Auto;


public class Main {


    public static void main(String[] args) {
        Auto lada = new Auto(
                "Lada",
                "Granta",
                2015,
                "Россия",
                "мкпп",
                "желтый",
                1.5,
                "седан",
                "м000м",
                5,
                true,
                null);
        System.out.println(lada);

        Auto audi = new Auto(
                "Audi",
                "A8 50l TDI quattro",
                2020,
                "Германия",
                "АКПП",
                "СЕРЫЙ",
                3.0,
                "седан",
                "т000т",
                5,
                true,
                new Auto.Key(true,true));
        System.out.println(audi);


        Auto bmw = new Auto(
                "BMW",
                "Z8",
                2021,
                "Германия",
                "АКПП",
                "черный",
                6.0,
                "купе",
                "К000К",
                4,
                true,
                null

        );
        System.out.println(bmw);


        Auto kia = new Auto(
                "KIA",
                "Sportage 4-го поколения",
                2018,
                "Южная корея",
                "АКПП",
                "красный",
                2.4,
                "седан",
                "е000е",
                5,
                false,
                new Auto.Key(true,false));
        System.out.println(kia);


        Auto hyundai = new Auto(
                "Hyundai ",
                "Avante",
                2016,
                "Южная корея",
                "Акпп",
                "серый",
                3.0,
                "кроссовер",
                "в000в",
                5,
                false,
                null);
        System.out.println(hyundai);


    }

}