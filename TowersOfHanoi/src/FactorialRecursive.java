import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dear user, please select n:");
        int n = scanner.nextInt();

        long f = factorial(n);

        System.out.printf("factorial of %d is %d", n, f);

        scanner.close();
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
