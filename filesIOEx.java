import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.module.ModuleDescriptor.Provides;
import java.util.Scanner;

public class filesIOEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter number: ");
        String number = scanner.nextLine().trim();

        // Define file path
        String filePath = "\\<you file's entire path>\\java2.csv"; // [windows: use \\ ] | [on mac/linus: use //]

        // Writing to file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(name + " | " + number);
            writer.newLine();
            System.out.println("[SUCCESS] Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("[ERROR] Failed to write to file!");
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("[INFO] Scanner closed.");
        }
    }


    //      * BufferedReader & BufferedWriter:
    //  * ---------------------------------
    //  * BufferedReader:
    //  * - Used to read text from an input stream efficiently.
    //  * - Reads data line by line, making it faster than Scanner for large files.
    //  * - Example:
    //  *   BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    //  *   String line = br.readLine();
    //  *   br.close();
    //  *
    //  * BufferedWriter:
    //  * - Used to write text to an output stream efficiently.
    //  * - Provides buffering for efficient writing of characters, arrays, and lines.
    //  * - Example:
    //  *   BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
    //  *   bw.write("Hello, World!");
    //  *   bw.newLine();
    //  *   bw.close();
    //  */
}
