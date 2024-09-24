import java.util.Scanner;
import java.util.Random;

public class Assignment_1_Main {
    public static void main(String[] args) {
        Part1();
        Part2();
    }
    public static void Part1() {
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
    public static void Part2() {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index between 0 and 99: ");
        try {
            int index = scanner.nextInt();

            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}