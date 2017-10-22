public class Employee1
{
    private String firstName;
    private String secondName;
    private double monthlySalary;

    public Employee1(String firstName, String secondName, double monthlySalary)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        if (monthlySalary >= 0)
            this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void setIncreaseTenPercent()
    {
        this.monthlySalary = monthlySalary * 1.1;
    }

    public double getSalaryPerYear()
    {
        double salaryPerYear = monthlySalary * 12;
        return salaryPerYear;
    }

}
