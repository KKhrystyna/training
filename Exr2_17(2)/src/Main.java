import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;
        int average;
        int product;


        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        System.out.print("Enter third integer: ");
        c = input.nextInt();

        sum = a + b + c;
        average = sum / 3;
        product = a * b * c;

        System.out.printf("%s%d%n%s%d%n%s%d%n", "Sum is ", sum, "Average is ", average, "Product is ", product);

        if (a > b)
            if (a > c)
                System.out.printf("%s %d%n", "Largest number is", a);

        if (b > a)
            if (b > c)
                System.out.printf("%s %d%n", "Largest number is", b);

        if (c > a)
            if (c > b)
                System.out.printf("%s %d%n", "Largest number is", c);

        if (a < b)
            if (a < c)
                System.out.printf("%s %d%n", "Smallest number is", a);

        if (b < a)
            if (b < c)
                System.out.printf("%s %d%n", "Smallest number is", b);

        if (c < a)
            if (c < b)
                System.out.printf("%s %d%n", "Smallest number is", c);
    }
}