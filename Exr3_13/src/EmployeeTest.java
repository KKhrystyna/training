public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("John", "Smitt", 2300.00);
        Employee employee2 = new Employee("Mary", "Cuprum", -1700.00);


        employee1.setMonthlySalary(5000);
        employee1.getEmployeeInfo();
        employee2.getEmployeeInfo();
//        employee2.setMonthlySalary(employee2.getMonthlySalary());

        System.out.printf("Salary per year for:%n%s %s %.2f%n%s %s %.2f%n",
                employee1.getFirstName(), employee1.getSecondName(), employee1.getIncomePerYear(), employee2.getFirstName(), employee2.getSecondName(), employee2.getIncomePerYear());

        employee1.increaseEmployeeSalaryTenPercent();


        System.out.printf("After raise salary per year will be:%n%s %s %.2f%n%s %s %.2f%n",
                employee1.getFirstName(), employee1.getSecondName(), employee1.getIncomePerYear(), employee2.getFirstName(), employee2.getSecondName(), employee2.getIncomePerYear());

    }
}

