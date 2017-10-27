import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && a == c) {

            System.out.println("Your numbers can represent right triangle");
            return;
        }
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Your numbers can NOT represent triangle");
            return;
        }
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("One or all numbers have zero value.");
        }
    }
}