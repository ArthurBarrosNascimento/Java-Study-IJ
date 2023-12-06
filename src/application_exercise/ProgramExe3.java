package application_exercise;

import entities_exercise.CompanyEx3;
import entities_exercise.IndividualEx3;
import entities_exercise.TaxPayerEx3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExe3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayerEx3> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i =  1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                TaxPayerEx3 payer = new IndividualEx3(name, income, healthExpenditures);
                list.add(payer);
            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                TaxPayerEx3 payer = new CompanyEx3(name, income, numberOfEmployees);
                list.add(payer);
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sum = 0.0;
        for (TaxPayerEx3 taxPeyers: list) {
            System.out.println(taxPeyers.getName() +": $ " + taxPeyers.tax());
            sum += taxPeyers.tax();
        }
        
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + sum);

        sc.close();
    }
}
