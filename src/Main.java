import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a file path: ");
      String strPath = sc.nextLine();

      File path = new File(strPath);

      System.out.println("getName: " + path.getName());
      System.out.println("getParant: " + path.getParent());
      System.out.println("getPath: " + path.getPath());

      sc.close();
    }
}   