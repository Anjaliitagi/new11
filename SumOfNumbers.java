import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Calculate the sum of numbers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Output the result
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
