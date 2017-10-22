import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter first integer: ");
        number = input.nextInt();

        if (number != 7)
            System.out.println("The variable number is not equal to 7");
    }
}
