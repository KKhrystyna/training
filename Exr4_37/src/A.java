import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter non negative number:");
        long number = input.nextInt();

        long factorial = 1;

        if (number > 0) {
            boolean repeat = true;
            long counter = number;
            while (repeat) {
                factorial = factorial * counter;

                counter -= 1;
                if (counter == 0) {
                    repeat = false;
                }
            }
            System.out.printf("Factorial %d = %d", number, factorial);
        }
        if (number == 0) {
            factorial = 1;
            System.out.printf("Factorial %d = %d", number, factorial);
        }
        if (number < 0) {
            System.out.println("You wrote wrong format.");
        }
    }
}
