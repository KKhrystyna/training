import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int counter = 1;

        while (counter <= number) {
            int counter2 = 1;

            while (counter2 < number) {
                System.out.print("* ");
                counter2 += 1;
            }

            System.out.println("*");
            counter += 1;
        }
    }
}
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int number = input.nextInt();
//        int counter = 1;
//
//        while (counter <= number) {
//            int counter2 = 1;
//            while (counter2 < number) {
//                if (counter == 1 || counter == number) {
//                    System.out.print("* ");
//                } else {
//                    if (counter2 == 1 || counter2 == number) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//                counter2 += 1;
//            }
//            counter += 1;
//            System.out.println("*");
//        }
//    }
//}