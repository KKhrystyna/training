import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Enter first integer: ");
        a = input.nextInt();

        System.out.print("Enter second integer: ");
        b = input.nextInt();

        if (a > b)
            System.out.printf("%d %s", a, "is larger");

        if (a < b)
            System.out.printf("%d %s", b, "is larger");

        if (a == b)
            System.out.print("These numbers are equal");

            }
}
