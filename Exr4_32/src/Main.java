public class Main {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 8) {
            System.out.print("* ");

            int counter2 = 1;
            while (counter2 < 8) {
                System.out.print("* ");
                counter2 += 1;
            }
            System.out.println();
            int indent = counter % 2;

            if (indent != 0) {
                System.out.print(" ");
            }
            counter += 1;
        }
    }
}
