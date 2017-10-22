public class Main {

    public static void main(String[] args)
    {
	int product = 5;
	int x= 5;

	product *= x++;

	System.out.printf("Product is: %d%nx is: %d%n", product, x);
    }
}
