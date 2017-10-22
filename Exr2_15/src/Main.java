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

        System.out.printf("%d%n%d%n%d%n%d%n%d", (a+b), (a*b), (a-b), (a/b), (a%b));
    }
}