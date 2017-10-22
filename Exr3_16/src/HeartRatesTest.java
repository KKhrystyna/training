import java.time.LocalDate;
import java.util.Scanner;

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int currentYear = 2017;
        int currentDay = 5;
        int currentMonth = 7;


        System.out.println("Day of your birth:");
        dayOfBirth = input.nextInt();
        System.out.println("Month of birth:");
        monthOfBirth = input.nextInt();
        System.out.println("Year of birth:");
        yearOfBirth = input.nextInt();

        int age = calculateAge(yearOfBirth, currentYear, monthOfBirth, currentMonth, dayOfBirth, currentDay);


        System.out.println(age);

        int maxHeartRateForYou = calculateHeartRate(age);
        System.out.println(maxHeartRateForYou);
displayTargetHeartRate(maxHeartRateForYou);

//        HeartRates tester1 = new HeartRates("John", "Smith", dayOfBirth, monthOfBirth, yearOfBirth);
//
//        LocalDate birthDate = LocalDate.of(tester1.getYearOfBirth(), tester1.getMonthOfBirth(), tester1.getDayOfBirth());
//
//        int actual = AgeCalculator.calculateAge(birthDate, LocalDate.of(2017, 7, 5));
//
//        System.out.println("Your age is:" + actual);
    }

    public static int calculateAge(int birthYear, int currentYear, int birthMonth, int currentMonth, int birthDay, int currentDay)
    {
        int age = currentYear - birthYear;

        if (currentDay - birthDay < 0)
        {
            currentMonth--;
        }
        if (currentMonth - birthMonth < 0)
        {
            age--;
        }
        return age;
    }

    public static int calculateHeartRate(int age)
    {
        int maxHeartRate = 220;
        int heartRate = maxHeartRate - age;
        return heartRate;
    }

    public static void displayTargetHeartRate(double heartRate)
    {
        System.out.printf("%.2f - %.2f", heartRate*0.5, heartRate*0.85);
    }

}