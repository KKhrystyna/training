public class Main {

    public static void main(String[] args) {

        int year = 1;
        double amount;

        System.out.printf("%s %20s %n", "Year", "Amount on deposit");

        for (double principal = 1000; year <= 10; year++){
            principal = principal + principal * 5 / 100;
            amount = principal;
            System.out.printf("%4d %,20.2f %n", year, amount);
        }
    }
}
