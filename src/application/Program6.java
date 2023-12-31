package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import entities.Employee;

public class Program6 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\arthu\\Documents\\input.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);

            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
