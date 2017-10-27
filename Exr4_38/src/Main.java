import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 4-digit number:");
        int number = input.nextInt();

        int a = number / 1000;
        int b = number / 100 - a * 10;
        int c = number / 10 - a * 100 - b * 10;
        int d = number % 10;

        a = (a + 7) % 10;
        b = (b + 7) % 10;
        c = (c + 7) % 10;
        d = (d + 7) % 10;

        int a1 = c;
        int b1 = d;
        int c1 = a;
        int d1 = b;


        System.out.println(a1 + " " + b1 + " " + c1 + " " + d1);
    }
}
