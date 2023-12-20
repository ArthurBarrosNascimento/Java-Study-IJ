package application_exercise;

import entities_exercise.InstructorE6;
import entities_exercise.StudentEx6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramExe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("instructor name: ");
        String instructorName = sc.nextLine();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        for (int i = 0; i < vectA.length; i++) {
            int enrollNumber = sc.nextInt();
            vectA[i] = enrollNumber;
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        int[] vectB = new int[n];
        for (int i = 0; i < vectB.length; i++) {
            int enrollNumber = sc.nextInt();
            vectB[i] = enrollNumber;
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        int[] vectC = new int[n];
        for (int i = 0; i < vectC.length; i++) {
            int enrollNumber = sc.nextInt();
            vectC[i] = enrollNumber;
        }

        try {
            InstructorE6 instructor = new InstructorE6(instructorName);
            Set<StudentEx6> set = new HashSet<>();

            for (int j : vectA) {
                set.add(new StudentEx6(j));
            }

            for (int l : vectB) {
                set.add(new StudentEx6(l));
            }

            for (int m : vectC) {
                set.add(new StudentEx6(m));
            }

            for (StudentEx6 s: set) {
                instructor.addStudent(s);
            }

            System.out.println(instructor);
            System.out.println("Total students: " + set.size());

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
