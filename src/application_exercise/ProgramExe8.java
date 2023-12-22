package application_exercise;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExe8 {
    public static void  main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        double salaryForAvg = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> newList = list.stream()
                    .filter(e -> e.getSalary() > salaryForAvg)
                    .map(Employee::getEmail)
                    .sorted().toList();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryForAvg) + ":");
            newList.forEach(System.out::println);

            double sumSalary = list.stream()
                    .filter(x -> x.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': "
                    + String.format("%.2f", sumSalary));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
