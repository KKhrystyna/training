import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int a; //10000
        int b; //1000
        int c; //100
        int d; //10
        int e; //1

        System.out.println("Enter five-digits number: ");
        x = input.nextInt();

        if (x >= 100000)
        {
            System.err.println("Please write number with 5 digits!");
        }

        if (x <= 9999)
        {
            System.err.println("Please write number with 5 digits!");
        }


        a = x / 10000;
        b = (x / 1000) % 10 % 10;
        c = (x / 100) % 100 % 10 % 10;
        d = (x / 10) % 1000 % 10 % 10 % 10;
        e = x % 10000 % 10 % 10 % 10 % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", a, b, c, d, e);
    }

}
//
//        int a1, a2, a3, a4, a5;
//        if (x < 100000)
//            if (x > 9999)
//            {
//
//                a5 = x % 10;
//                x = x / 10;
//                a4 = x % 10;
//                x /= 10;
//                a3 = x % 10;
//                x /= 10;
//                a2 = x % 10;
//                x /= 10;
//                a1 = x % 10;
//                String lSp = "   ";
//                System.out.println(a1 + lSp + a2 + lSp + a3 + lSp + a4 + lSp + a5);
//    }
//}
//        int x;
//        int a;
//        int b;
//        int c;
//        int d;
//        int e;
//
//        System.out.println("Enter 5-digit integer: ");
//        x = input.nextInt();
//
//        a = x / 10000;
//        b = x / 1000 - a * 10;
//        c = x / 100 - x / 1000 * 10;
//        d = x / 10 - x / 100 * 10;
//        e = x - x / 10 * 10;
//
//        System.out.printf("%d   %d   %d   %d   %d   ", a, b, c, d, e);
//    }
//}