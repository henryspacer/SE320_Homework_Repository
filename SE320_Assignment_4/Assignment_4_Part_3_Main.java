import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
public class Assignment_4_Part_3_Main {
    public static void main(String[] args){
        // Part A

        double number = 12345.678;

        NumberFormat ukFormat = NumberFormat.getNumberInstance(Locale.UK);

        ukFormat.setMinimumFractionDigits(2);
        ukFormat.setMaximumFractionDigits(2);

        String formattedUK = ukFormat.format(number);
        System.out.println("UK format: " + formattedUK);

        // Part B

        double number2 = 12345.678;

        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        String formattedUSCurrency = usCurrencyFormat.format(number2);
        System.out.println("US currency format: " + formattedUSCurrency);

        // Part C

        String numberString = "12,345.678";

        NumberFormat format = NumberFormat.getNumberInstance();

        try {
            Number parsedNumber = format.parse(numberString);
            System.out.println("Parsed number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("Error parsing the number: " + e.getMessage());
        }
    }
}
