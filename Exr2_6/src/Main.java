import java.util.Scanner;

//Program will calculate the product of three integers
public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int a;
        int b;
        int c;
        int result1;
        int result2;
        int result3;

        System.out.print("Enter the x integer ");
        x = input.nextInt();

        System.out.print("Enter the y integer ");
        y = input.nextInt();

        System.out.print("Enter the z integer ");
        z = input.nextInt();

        System.out.print("Enter the a integer ");
        a = input.nextInt();

        System.out.print("Enter the b integer ");
        b = input.nextInt();

        System.out.print("Enter the c integer ");
        c = input.nextInt();

        result1 = x * y * z;
        result2 = a / b / c;
        result3 = result1 * result2;

        System.out.printf("Product is %d", result3);

    }
}
