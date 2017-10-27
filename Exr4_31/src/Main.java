import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number that contains of 0s and 1s:");

        long number = input.nextLong();
        boolean repeat = true;
        int decimal = 0;
        int counter = 1;

        while (repeat) {
            long b = number % 2;

            decimal += b * counter;

            number = number / 10;

            if (number <= 0)

            {
                repeat = false;
            }
            counter *= 2;
        }
        System.out.println(decimal);
    }
}