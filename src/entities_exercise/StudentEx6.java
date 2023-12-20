package entities_exercise;

import java.util.Objects;

public class StudentEx6 {
    private Integer enroll;

    public StudentEx6(Integer enroll) {
        this.enroll = enroll;
    }

    public Integer getEnroll() {
        return enroll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEx6 that = (StudentEx6) o;
        return Objects.equals(enroll, that.enroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enroll);
    }

    @Override
    public String toString() {
        return "Enroll: " + enroll;
    }
}
