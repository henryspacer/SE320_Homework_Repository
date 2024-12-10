import java.io.*;
import java.net.*;

public class Final_Assignment_Part_2 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("BMI Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected!");

                // Handle each client in a separate thread
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}

class ClientHandler implements Runnable {
    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            // Receive weight and height from client
            double weight = Double.parseDouble(in.readLine());
            double height = Double.parseDouble(in.readLine());

            // Calculate BMI
            double bmi = weight / (height * height);

            // Send result back to client
            String result = String.format("Your BMI is %.2f", bmi);
            out.println(result);
            System.out.println("BMI calculated and sent to client.");

        } catch (IOException e) {
            System.err.println("Error handling client: " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Error closing client socket: " + e.getMessage());
            }
        }
    }
}
