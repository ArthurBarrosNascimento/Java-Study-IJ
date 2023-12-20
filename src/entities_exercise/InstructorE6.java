package entities_exercise;

import java.util.ArrayList;
import java.util.List;

public class InstructorE6 {
    private String name;

    List<StudentEx6> student = new ArrayList<>();

    public InstructorE6(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentEx6> getStudent() {
        return student;
    }

    public void addStudent(StudentEx6 student) {
        getStudent().add(student);
    }

    @Override
    public String toString() {
        return "Instructor: "
                + name
                + "\n"
                + getStudent();
    }
}
