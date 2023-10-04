package chapter5;

public class CompoundIntrestRate {
    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 0;
        System.out.printf("%s    %14s     %20s     %20s     %14s   %22s   %22s  %n", "Year", "5%" ,"6%" , "7%", "8%", "9%", "10%");

        for (int year = 1; year <= 10; ++year) {
            for (int number = 5; number <= 10; number++) {
                rate = (double) number / 100;
                double amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f", year, amount);
            }
            System.out.println(" ");
        }
    }
}
