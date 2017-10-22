public class Account
{
    private String name;
    private double balance;

   public Account(String name, double balance)
    {
        this.name = name;

        if (balance > 0.0)
        {
            this.balance = balance;
        }

    }

    public void withdraw(double withdrawAmount)
    {
        if (balance - withdrawAmount >= 0.0)
        {
           this.balance = balance - withdrawAmount;
        }
        if (balance - withdrawAmount < 0.0)
            System.out.println("Withdrawal amount exceeded account balance.");


    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)

    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
