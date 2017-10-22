import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mile;
        int gallon;
        boolean repeat = true;
        int allMiles = 0;
        int allGallons = 0;

        Scanner inputForMe = new Scanner(System.in);

        while (repeat) {
            System.out.println("Please enter miles for trip: ");
            mile = inputForMe.nextInt();

            if (mile > 0) {
                System.out.println("And now gallons: ");
                gallon = inputForMe.nextInt();

                if (gallon > 0) {
                    double milesPerGallon = (double) mile / gallon;
                    System.out.printf("For this trip gas mileage is: %.2f miles per gallon%n", milesPerGallon);
                    allGallons += gallon;
                    allMiles += mile;
                }
                if (gallon == 0) {
                    repeat = false;

                }
                if (gallon < 0) {
                    System.out.println("Wrong gallons format!");
                }

            }

            if (mile == 0) {
                repeat = false;
            }
            if (mile < 0) {
                System.out.println("Wrong miles format!");
            }

        }
        double averageMilesPerGallon = (double) allMiles / allGallons;
        System.out.printf("For all trips gas mileage is: %.2f miles per gallon%n", averageMilesPerGallon);
    }
}
