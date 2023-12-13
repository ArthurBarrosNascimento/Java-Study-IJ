import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Type a folder path: ");
       String stfPath = sc.nextLine();

       File path = new File(stfPath);

       File[] folders = path.listFiles(File::isDirectory);
       System.out.println("FOLDERS:");

       for (File folder: folders) {
           System.out.println(folder);
       }

       System.out.println();

       File[] files = path.listFiles(File::isFile);
       System.out.println("FILES:");

        for (File file: files) {
            System.out.println(file);
        }

        boolean success = new File(stfPath + "\\subdir").mkdir();
        System.out.println("Directory created successfuly: " + success);

        folders = path.listFiles(File::isDirectory);
        for (File folder: folders) {
            System.out.println(folder);
        }

       sc.close();
    }
}   