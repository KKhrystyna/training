import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number1;
        int largest ;

        System.out.println("Enter 10 numbers:");
        largest = input.nextInt();

        while (counter < 10) {
            number1 = input.nextInt();
            counter += 1;

            if (number1 > largest) {
                largest = number1;
            }
        }
        System.out.printf("Largest number is: %d", largest);
    }
}
