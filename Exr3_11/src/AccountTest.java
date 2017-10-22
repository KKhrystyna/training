import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane", 100.00);
        Account account2 = new Account("Bon", 120.00);


        System.out.printf("Account1 %s have balance: %.2f%n", account1.name, account1.getBalance());

        account1.putMoneyToBalance(200.0);
        System.out.printf("Account1 %s have balance: %.2f%n", account1.name, account1.getBalance());

        account1.name="janifer";


        account1.withdrawFromBalance(2000.0);
        System.out.printf("Account1 %s have balance: %.2f", account1.getName(), account1.getBalance());
    }
}
