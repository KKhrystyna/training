import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double weight;
        double height;
        double BMI;

        System.out.print("Enter your weight in kilograms ");
        weight = input.nextDouble();

        System.out.print("Enter your height in metres ");
        height = input.nextDouble();

        BMI = weight / (height * height);
        System.out.printf("%s%.2f%n", "Your body mass index is ", BMI);

    }
}