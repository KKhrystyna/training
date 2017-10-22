import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean repeat = true;

        while (repeat) {
            System.out.println("Please enter 5-digit number:");
            int number = input.nextInt();
            if (number < 99999 && number > 10000) {
                int a = number / 10000;
                int b = number / 1000 - a * 10;
                int c = number / 100 - a * 100 - b * 10;
                int d = number / 10 - a * 1000 - b * 100 - c * 10;
                int e = number % 10;
                if (a == e && b == d) {
                    System.out.println("Number is palindrome.");
                    repeat = false;
                } else {
                    System.out.println("NOT palindrome.");
                }

            } else {
                System.out.println("Wrong format.");
            }
        }
    }
}