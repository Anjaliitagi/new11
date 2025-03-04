import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        
        // Loop to ensure only valid integers are entered
        for (int i = 0; i < 5; i++) {
            // Try-catch block to catch InputMismatchException
            try {
                sum += scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear the invalid input from the scanner
                i--; // Decrement i to retry the current iteration
            }
        }

        System.out.println("The sum of the 5 numbers is: " + sum);
        scanner.close();
    }
}
