public class Account
{
    public String name;
    private Double balance;


    public Account(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }

//    public void setBalance(Double balance)
//    {
//        this.balance = balance;
//    }

    public void putMoneyToBalance(Double sum)
    {
        this.balance = balance + sum;
    }

    public void withdrawFromBalance(Double sum)
    {
        if (balance - sum > 0)
                {
            this.balance = balance - sum;
        }
        if (balance - sum < 0)
            System.out.println("No money,no honey");
    }

    public Double getBalance()
    {
        return balance;
    }
}

