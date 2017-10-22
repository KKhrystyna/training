import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double item;
        boolean repeat = true;
        double allItems = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Print value of your item or 0 to exit.");

        while (repeat) {
            item = input.nextDouble();

            if (item > 0) {
                allItems = allItems + item;
            }

            if (item == 0) {
                double salary = 200 + allItems * 9 / 100;
                System.out.printf("Your salary per week is: %.2f", salary);
                repeat = false;
            }
        }
    }
}
