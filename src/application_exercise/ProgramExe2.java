package application_exercise;

import entities_exercise.ImportedProductEx2;
import entities_exercise.ProductEx2;
import entities_exercise.UsedProductEx2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class ProgramExe2 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<ProductEx2> listProduct = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double curstomsFree = sc.nextDouble();
                ProductEx2 pro = new ImportedProductEx2(nameProduct, priceProduct, curstomsFree);
                listProduct.add(pro);
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                ProductEx2 pro = new UsedProductEx2(nameProduct, priceProduct, date);
                listProduct.add(pro);
            } else {
                ProductEx2 pro = new ProductEx2(nameProduct, priceProduct);
                listProduct.add(pro);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");

        for (ProductEx2 pro: listProduct) {
            System.out.println(pro.priceTag());
        }

        sc.close();
    }
}
