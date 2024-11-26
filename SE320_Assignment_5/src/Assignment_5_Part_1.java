import java.util.Scanner;

public class Assignment_5_Part_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();
        System.out.println("Enter your birth month (1-12):");
        int birthMonth = scanner.nextInt();
        System.out.println("Enter your birth day (1-31):");
        int birthDay = scanner.nextInt();

        Day birthDate = new Day(birthYear, birthMonth, birthDay);

        java.util.Calendar today = java.util.Calendar.getInstance();
        int currentYear = today.get(java.util.Calendar.YEAR);
        int currentMonth = today.get(java.util.Calendar.MONTH) + 1;
        int currentDay = today.get(java.util.Calendar.DAY_OF_MONTH);

        Day currentDate = new Day(currentYear, currentMonth, currentDay);

        int daysElapsed = currentDate.daysFrom(birthDate);

        System.out.println("Number of days since your birth: " + daysElapsed);
    }
}

class Day {
    private int year, month, day;

    public Day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int daysFrom(Day other) {
        java.util.Calendar thisDate = java.util.Calendar.getInstance();
        thisDate.set(this.year, this.month - 1, this.day); // Months are 0-based
        java.util.Calendar otherDate = java.util.Calendar.getInstance();
        otherDate.set(other.year, other.month - 1, other.day);

        long diffInMillis = thisDate.getTimeInMillis() - otherDate.getTimeInMillis();
        return (int) (diffInMillis / (1000 * 60 * 60 * 24)); // Convert milliseconds to days
    }
}
