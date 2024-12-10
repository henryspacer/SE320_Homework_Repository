import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Final_Assignment_Part_1_Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            Scanner scanner = new Scanner(System.in);

            // Get weight and height from user
            System.out.print("Enter weight in kilograms: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height in meters: ");
            double height = scanner.nextDouble();

            // Send data to server
            out.println(weight);
            out.println(height);

            // Receive and display result from server
            String response = in.readLine();
            System.out.println(response);

        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
