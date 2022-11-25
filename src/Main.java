public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        double salary = 15000;
        double percent = 0.01;
        double total = 0;
        for (int i = 0; total <= 2_459_000; i++) {
            total = (total + salary) * (1 + percent);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей. ");
        }

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 204_000;
        int deathRate = 96_000;
        int populationIncrease = birthRate - deathRate;
        int populationTotal = 0;
        for (int i = 2022; i <= 2032; i++) {
            populationTotal = ((populationTotal + populationIncrease) + population);
            System.out.println(" Год " + i + " , численность населения составляет " + populationTotal);
        }
        /// Ничего снова не получилось!!!

        //Задание 4
        System.out.println("Задание 4");
        double salary1 = 15000;
        double percent1 = 0.005833;
        double total1 = 0;
        for (int i = 1; total1 <= 12_000_000; i++) {
            total1 = (total1 + salary1) * (1 + percent1);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total1 + " рублей. ");
        }
        //Задание 5
        System.out.println("Задание 5");
        double salary2 = 15000;
        double percent2 = 0.005833;
        double total2 = 0;
        for (int i = 1; total2 <= 12_000_000; i++) {
            total2 = (total2 + salary2) * (1 + percent2);
            if (i % 6 == 0) ;
            {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total2 + " рублей. ");
            }
        }
        /// снова ничего!
        //Задание 6
        System.out.println("Задание 6");
        // аналогично заданию 5
        //Задание 7
        System.out.println("Задание 7");
        int salary12 =1500;
        int total12=0;
        int i=0;
        for (; total12 <=12_000_000 ; i++) {
            total12 =total12 + salary12;
            if (i%6==0); {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total12 + " рублей. ");
            }

        }
        //Задание 7
        System.out.println("Задание 7");

    }
}

