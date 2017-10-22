import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer: ");

        int x;
        int diameter;
        double circumference;
        double area;

        x = input.nextInt();

        diameter = 2 * x;
        circumference = 2 * (Math.PI * x);
        area = Math.PI * x * x;

        System.out.printf("%s%d%n", "Diameter = ", diameter);
        System.out.printf("%s%f%n", "Circumference = ", circumference);
        System.out.printf("%s%f%n", "Area = ", area);

//        int r;
//        double p = Math.PI;
//        double diameter;
//        double circumference;
//        double area;
//
//        System.out.print("Enter integer: ");
//        r = input.nextInt();
//
//        diameter = 2 * r;
//        circumference = 2 * p * r;
//        area = p * r * r;
//
//        System.out.printf("%s%f%n%s%f%n%s%f%n","Diameter is ", diameter, "Circumference is ", circumference, "Area is ", area);
//
//        System.out.printf("Diameter is %f%nCircumference is %f%nArea is%f%n", (diameter), (circumference), (area));

    }
}
