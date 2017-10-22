public class Main
{

    public static void main(String[] args)
    {
        long population = 7468873999L;
        double increasePerYear = 1.013;

        double firstYear = population * increasePerYear;
        double secondYear = firstYear * increasePerYear;
        double thirdYear = secondYear * increasePerYear;
        double forthYear = thirdYear * increasePerYear;
        double fifthYear = forthYear * increasePerYear;

        System.out.printf("%s%d%n", "Count of people now is ", population);
        System.out.printf("%s%.0f%n", "Count of people after one year increase is ", firstYear);
        System.out.printf("%s%.0f%n", "Count of people after two years increase is ", secondYear);
        System.out.printf("%s%.0f%n", "Count of people after three years increase is ", thirdYear);
        System.out.printf("%s%.0f%n", "Count of people after four years increase is ", forthYear);
        System.out.printf("%s%.0f%n", "Count of people after five years increase is ", fifthYear);
    }
}
