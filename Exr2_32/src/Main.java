import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        Scanner input = new Scanner(System.in);
//        int a;
//
//        System.out.print("Enter first integer: ");
//        a = input.nextInt();
//        if (a > 0)
//        {
//            System.out.printf("%s%d%s%n", "Число ", a, " позитивне");
//        }
//        if (a < 0)
//        {
//            System.out.printf("%s%d%s%n", "Число ", a, " негатине");
//        }
//        if (a == 0)
//        {
//            System.out.printf("%s%d%s%n", "Число ", a, " рівне нулю");
//        }

        Scanner input = new Scanner(System.in);
        int x, a = 0, b = 0, c = 0;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        if (x > 0)
        {
            a = a + 1;
        }
        if (x < 0)
        {
            b = b + 1;
        }
        if (x == 0)
        {
            c = c + 1;
        }
        System.out.print("Enter second integer: ");
        x = input.nextInt();

        if (x > 0)
        {
            a = a + 1;
        }
        if (x < 0)
        {
            b = b + 1;
        }
        if (x == 0)
        {
            c = c + 1;
        }
        System.out.print("Enter third integer: ");
        x = input.nextInt();

        if (x > 0)
        {
            a = a + 1;
        }
        if (x < 0)
        {
            b = b + 1;
        }
        if (x == 0)
        {
            c = c + 1;
        }
        System.out.print("Enter forth integer: ");
        x = input.nextInt();

        if (x > 0)
        {
            a = a + 1;
        }
        if (x < 0)
        {
            b = b + 1;
        }
        if (x == 0)
        {
            c = c + 1;
        }
        System.out.print("Enter fifth integer: ");
        x = input.nextInt();

        if (x > 0)
        {
            a = a + 1;
        }
        if (x < 0)
        {
            b = b + 1;
        }
        if (x == 0)
        {
            c = c + 1;
        }

        System.out.printf("%s%d%n%s%d%n%s%d%n", "Count of positive integer is ", a,"Count of negative integer is ", b, "Count of integer that are equal to 0 is ", c);
    }
}