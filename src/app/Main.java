package app;

public class Main {

    static double income;
    static double tax;
    static String output;

    public static void main(String[] args) {

        //Инициализация дохода
        income = 30000;

        //Рассчитаем налог по прогрессивной
        // шкале налогообложения
        if (income <= 10000) {
            tax = income * 2.5 / 100;
        } else if (income <= 25000) {
            tax = 10000 * 2.5 / 100 + (income - 10000) * 4.3 / 100;
        } else {
            tax = 10000 * 2.5 / 100 + 15000 * 4.3 / 100 + (income - 25000) * 6.7 / 100;
        }
         //Вывoдим рассчитанный налог
        output = "The tax on an income of " + income + " is " + tax;
        System.out.println(output);
    }
}