package application_exercise;

import entities_exercise.EmployeeEx1;
import entities_exercise.OutSourcedEmployeeEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExe1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeEx1> listEmploye = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double addtionalCharge = sc.nextDouble();
                EmployeeEx1 emp = new OutSourcedEmployeeEx1(name, hours, valuePerHour, addtionalCharge);
                listEmploye.add(emp);
            }
            else {
                EmployeeEx1 emp = new EmployeeEx1(name, hours, valuePerHour);
                listEmploye.add(emp);
            }
        }

        System.out.println("PAYMENTS:");
        for (EmployeeEx1 emp: listEmploye ) {
            System.out.println(emp.getName() + " - " + emp.payment());
        }
        sc.close();
    }
}
