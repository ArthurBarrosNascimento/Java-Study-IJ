import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good mornig", "Good afternoon", "Good nigth"};


        String path = "C:\\Users\\arthu\\Documents\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}   