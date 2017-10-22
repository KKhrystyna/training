public class Main
{

    public static void main(String[] args)
    {
        int x = 3;
        int y = 10;
        if (x > 5)
            if (y > 5)
                System.out.println("x and y are > 5");
            else
                System.out.println("x is <= 5");
    }

    {
        int x = 6;
//        if (x >= 60)
//            System.out.println("Passed");
//        else
//        {
//            System.out.println("Failed");
//            System.out.println("You must take this course again.");}

        System.out.println(x >= 60 ? "Passed" : "Failed");
    }
}

