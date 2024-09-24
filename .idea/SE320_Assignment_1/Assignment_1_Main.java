import java.util.Scanner;

public class Assignment_1_Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the second integer: ");
                num2 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}