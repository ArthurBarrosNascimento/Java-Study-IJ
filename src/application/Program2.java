package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Shape #"+ i +" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape form = new Rectangle(color, width, height);
                list.add(form);
            } else if (ch == 'c') {
                System.out.print("Radius: ");
                double radios = sc.nextDouble();

                Shape form = new Circle(color, radios);
                list.add(form);
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape shapeList: list) {
            System.out.printf("%.2f%n", shapeList.area());
        }

        sc.close();
    }
}
