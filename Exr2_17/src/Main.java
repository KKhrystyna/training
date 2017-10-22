import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Enter the first integer: ");
        a = input.nextInt();

        System.out.print("Enter the second integer: ");
        b = input.nextInt();

        System.out.print("Enter the third integer: ");
        c = input.nextInt();

        if (a < b)
            if (b < c)
                System.out.printf("%s %d%n", "Smallest number is  ", a);

        if (b < a)
            if (b < c)
                System.out.printf("%s %d%n", "Smallest number is  ", b);

        if (c < a)
            if (c < b)
                System.out.printf("%s %d%n", "Smallest number is  ", c);

        if (a > b)
            if (b > c)
                System.out.printf("%s %d%n", "Largest number is  ", a);

        if (b > a)
            if (b > c)
                System.out.printf("%s %d%n", "Largest number is  ", b);

        if (c > a)
            if (c > b)
                System.out.printf("%s %d%n", "Largest number is  ", c);

        System.out.printf("%s %d%n", "Sum is ", a + b + c);
        System.out.printf("%s %d%n", "Average is ", (a + b + c) / 3);
        System.out.printf("%s %d%n", "Product is ", a * b * c);


    }
}
