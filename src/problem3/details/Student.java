package problem3.details;

import java.util.Objects;

public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return rollNumber + "." + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        Student student = (Student) o;
        if (rollNumber > student.rollNumber) {
            return true;
        }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}
