public class Main {

    public static void main(String[] args) {

        int a = 0;

        System.out.printf("%s%8s%9s%9s%n", "N", "10*N", "100*N", "1000*N");

        while (a < 9) {

            a += 1;
            System.out.printf("%d%6d%9d%9d%n", a, a * 10, a * 100, a * 1000);
        }
    }
}

