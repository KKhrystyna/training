import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int c;

        System.out.print("Enter number: ");
        x = input.nextInt();

        c = x % 2;

        if (c == 0)
            System.out.print("Number is even");

        if (c != 0)
            System.out.print("Number is odd");

//        c = x % 2;
//
//        if (c == 1)
//            System.out.print("Integer is odd");
//
//        if (c == 0)
//            System.out.print("Integer is even");

    }
}
