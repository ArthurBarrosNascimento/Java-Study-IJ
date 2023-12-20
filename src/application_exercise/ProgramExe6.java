package application_exercise;

import entities_exercise.InstructorE6;
import entities_exercise.StudentEx6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramExe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("instructor name: ");
            String instructorName = sc.nextLine();

            InstructorE6 instructor = new InstructorE6(instructorName);

            Set<StudentEx6> a = new HashSet<>();
            Set<StudentEx6> b = new HashSet<>();
            Set<StudentEx6> c = new HashSet<>();

            System.out.print("How many students for course A? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int enrollNumber = sc.nextInt();
                a.add(new StudentEx6(enrollNumber));
            }

            System.out.print("How many students for course B? ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int enrollNumber = sc.nextInt();
                b.add(new StudentEx6(enrollNumber));
            }

            System.out.print("How many students for course C? ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int enrollNumber = sc.nextInt();
                c.add(new StudentEx6(enrollNumber));
            }

            Set<StudentEx6> set = new HashSet<>(a);
            set.addAll(b);
            set.addAll(c);

            for (StudentEx6 s: set) {
                instructor.addStudent(s);
            }

            System.out.println(instructor);
            System.out.println("Total students: " + set.size());

            sc.close();

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
