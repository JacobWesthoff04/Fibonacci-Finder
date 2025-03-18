import java.util.Scanner;

public class fibonacciFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        int postition = scanner.nextInt();
        scanner.close();

        if (postition < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            int result = fibonacci(postition);
            System.out.println("The Fibonacci number in position " + postition + " is " + result + ".");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

