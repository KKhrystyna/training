import java.util.Scanner;

public class Analysis
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10)
        {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result < 1 || result > 2)
            {
                System.out.println("Write valid result!");
            } else {
                if (result == 1)
                {
                    passes = passes + 1;
                } else {
                    failures = failures + 1;
                }
                studentCounter += 1;
            }
        }
        System.out.printf("The number of passes is: %d%n", passes);
        System.out.printf("The number of failures is: %d%n", failures);

        if (passes > 8)
        {
            System.out.print("Bonus to instructor!");
        }
    }
}

//import java.util.Scanner;
//
//public class Analysis
//{
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//
//        int passes = 0;
//        int failures = 0;
//        int studentCounter = 1;
//
//        while (studentCounter <= 10)
//        {
//            System.out.print("Enter result (1 = pass, 2 = fail): ");
//            int result = input.nextInt();
//
//            if (result == 1)
//                passes = passes + 1;
//            else
//                failures = failures + 1;
//
//            studentCounter = studentCounter + 1;
//        }
//        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
//
//        if (passes > 8)
//            System.out.println("Bonus to instructor!");
//    }
//}