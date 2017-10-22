import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 2;
        int number;
        int largest1;
        int largest2;

        System.out.println("Enter 10 numbers:");
        largest1 = input.nextInt();
        largest2 = input.nextInt();

        while (counter < 10) {
            counter += 1;
            number = input.nextInt();

            if (number > largest1 && number > largest2) {
                if (largest1 > largest2) {
                    largest2 = number;
                } else {
                    largest1 = number;
                }
            }

            if (number > largest1 && number < largest2) {
                largest1 = number;
            }
            if (number < largest1 && number > largest2) {
                largest2 = number;
            }
        }
        System.out.printf("Largest numbers is: %d %d", largest1, largest2);
    }
}