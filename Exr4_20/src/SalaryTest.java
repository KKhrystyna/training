import java.util.Scanner;

public class SalaryTest {
    public static void main(String[] args) {

        boolean repeat = true;
        String name;
        String surname;
        double hours;
        double rate;


        Scanner input = new Scanner(System.in);

        while (repeat) {
            System.out.println("Name: ");
            name = input.next();
            System.out.println("Surname: ");
            surname = input.next();
            System.out.println("Hours per week: ");
            hours = input.nextDouble();
            System.out.println("Rate: ");
            rate = input.nextDouble();

            Employee ac1 = new Employee(name, surname, hours, rate);
            System.out.printf("For %s %s gross pay is: %.2f%n", ac1.getName(), ac1.getSurname(), ac1.calculateSalary());

        }
    }
}


