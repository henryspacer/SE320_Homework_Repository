import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment_4_Part_2_Main {
    public static void main(String[] args){
        TreeSet<String> words = new TreeSet<>();
        String filePath = "words.txt";
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            return;
        }
        System.out.println("Nonduplicate words in ascending order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
