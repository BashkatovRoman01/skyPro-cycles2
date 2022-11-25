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
    }
}