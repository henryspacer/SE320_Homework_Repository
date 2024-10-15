import java.util.Scanner;

public class Assignment_2_Part_3_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = scanner.nextInt();

        assert number >= 0 && number <= 10 : "The entered number is out of range";

        System.out.println("You entered: " + number);

        scanner.close();
    }
}