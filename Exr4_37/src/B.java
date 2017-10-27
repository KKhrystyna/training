import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double x = input.nextDouble();

        int counter = 1;
        double e = 1;
        while (counter <= number) {
            e = e +  x / getFactorial(counter);
            counter = counter + 1;
            x *= x;
        }

        System.out.println(e);
    }

    public static Long getFactorial(long f) {
        long factorial = 1;
        while (f > 0) {
            factorial *= f--;
        }
        return factorial;
    }
}