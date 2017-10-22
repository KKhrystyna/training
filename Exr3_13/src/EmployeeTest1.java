
public class EmployeeTest1
{
    public static void main(String[] args)
    {
        Employee1 jone = new Employee1("Jone", " Smith", 700);
        Employee1 mary = new Employee1("Mary", "Snow", -950);

        System.out.printf("Salary per month for: %n%s %s %.2f%n%s %s %.2f%n",
                jone.getFirstName(), jone.getSecondName(), jone.getMonthlySalary(), mary.getFirstName(), mary.getSecondName(), mary.getMonthlySalary());

        System.out.printf("Salary per year for: %n%s %s %.2f%n%s %s %.2f%n",
                jone.getFirstName(), jone.getSecondName(), jone.getSalaryPerYear(), mary.getFirstName(), mary.getSecondName(), mary.getSalaryPerYear());

        jone.setMonthlySalary(1000);
        mary.setMonthlySalary(200);

        System.out.printf("Salary per month for: %n%s %s %.2f%n%s %s %.2f%n",
                jone.getFirstName(), jone.getSecondName(), jone.getMonthlySalary(), mary.getFirstName(), mary.getSecondName(), mary.getMonthlySalary());

        jone.setIncreaseTenPercent();
        mary.setIncreaseTenPercent();

        System.out.printf("Salary per year with ten percent increase for: %n%s %s %.2f%n%s %s %.2f%n",
                jone.getFirstName(), jone.getSecondName(), jone.getSalaryPerYear(), mary.getFirstName(), mary.getSecondName(), mary.getSalaryPerYear());


    }

}
