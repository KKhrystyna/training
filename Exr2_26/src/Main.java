import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter first integer: ");
        a = input.nextInt();
        System.out.print("Enter second integer: ");
        b = input.nextInt();
        c = a % b;
        if (a > b && c == 0)
        {
            System.out.print("Число " + a + " кратне числу " + b);
        }
        if (b > a)
        {
            System.out.print("Число " + a + " менше числа " + b);
        }
    }
}