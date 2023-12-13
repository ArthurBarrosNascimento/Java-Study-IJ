package application_exercise;

import entities_exercise.ProductEx5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
contents of the input.csv file:
    TV LED,1290.99,1
    Video Game Chair,350.50,3
    Iphone X,900.00,2
    Samsung Galaxy 9,850.00,2
*/

public class ProgramExe5 {
    public static void main(String[] args) {
        String path = "C:\\Users\\arthu\\Documents\\input.csv";
        List<ProductEx5> list = new ArrayList<>();
        File sourceFile = new File(path);

        readFile(path);

        String sourceFolder = sourceFile.getParent();

        boolean success = new File(sourceFolder + "\\out").mkdir();

        String targetFile = sourceFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] filds = itemCsv.split(",");
                String name = filds[0];
                double price = Double.parseDouble(filds[1]);
                int quantity = Integer.parseInt(filds[2]);

                list.add(new ProductEx5(name, price, quantity));
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for (ProductEx5 item: list) {
                    bw.write(item.getProductName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println();
                System.out.println("File file created successfully path" + targetFile);
                System.out.println();

            }catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        readFile(targetFile);
    }

    private static void readFile(String path) {
        File file = new File(path);

        try (BufferedReader br = new BufferedReader( new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
