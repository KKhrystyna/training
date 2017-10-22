public class Employee

{
    private String firstName;
    private String secondName;
    private double monthlySalary;

    public Employee(String firstName, String secondName, double monthlySalary)
    {
        this.firstName = firstName;
        this.secondName = secondName;
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

    public void setMonthlySalary(double updateSalary)
    {
        if (updateSalary < 0){
            this.monthlySalary = 0;
//            System.out.printf("No information for " + firstName + " " + secondName + "%n");
        }
        if (updateSalary >= 0){
            this.monthlySalary = updateSalary;
//            System.out.printf("Salary per month for " + firstName + " " + secondName + " " + updateSalary + "%n");
        }
    }

    public double getMonthlySalary()
    {
        return monthlySalary;
    }

    public void increaseEmployeeSalaryTenPercent()
    {
            monthlySalary = monthlySalary *1.1;
    }

    public double getIncomePerYear()
    {
        double incomePerYear = monthlySalary * 12;
        return incomePerYear;
    }

    public void getEmployeeInfo(){
        System.out.println("Username; " + firstName + " salary: " + monthlySalary + " per year: " + getIncomePerYear());
    }
}


