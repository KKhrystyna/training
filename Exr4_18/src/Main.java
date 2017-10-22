import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;
        boolean repeat = true;

        Scanner input = new Scanner(System.in);

        while (repeat) {
            System.out.printf("%s%n%s", "Please enter your information.", "Account number: ");
            accountNumber = input.nextInt();

            if (accountNumber > 0) {

                System.out.println("Balance at the beginning of the month: ");
                beginningBalance = input.nextInt();
                System.out.println("Total of all items charged by the customer this month: ");
                charges = input.nextInt();
                System.out.println("Total of all credits applied to the customer’s account this month: ");
                credits = input.nextInt();
                System.out.println("Allowed credit limit: ");
                creditLimit = input.nextInt();
                int newBalance = beginningBalance - charges + credits;
                System.out.printf("New balance: %d%n", newBalance);

                if (newBalance < creditLimit) {
                    System.out.printf("Credit limit for account number %d exceed!%n", accountNumber);
                }
            }

            if (accountNumber <= 0) {
                repeat = false;
            }

        }
    }
}

