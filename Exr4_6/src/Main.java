//public class Main {
//
//    public static void main(String[] args) {
//        int sum = 0;
//        int x = 1;
//
//        while (x != 11) {
//            int newSum = sum + x++;
//            System.out.printf("The sum is: %d%n", newSum);
//        }
//
//    }
//}

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        while (x < 11) {
            sum += x;
            ++x;
            System.out.printf("The sum is: %d:%d%n", sum, x);
        }

    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        int sum = 0;
//        int x = 1;
//
//        while (x <= 10) {
//            sum += x;
//            ++x;
//        }
//        System.out.printf("The sum is: %d%n", sum);
//    }
//}