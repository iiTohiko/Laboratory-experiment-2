package laboratory2.domain;

import java.util.ArrayList;

public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private ArrayList<Course> courses;

    public Student(String studentNumber, String name, String program, ArrayList<Course> courses) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.program = program;
        this.courses = courses;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getProgram() {
        return this.program;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Student Number: " + this.studentNumber + "\n");
        sb.append("Student Name: " + this.name + "\n");
        sb.append("Program: " + this.program + "\n");
        sb.append("Total Units Enrolled: " + this.courses.size() + "\n\n");

        sb.append("Course Code\t\tDescription          \tUnit\tDay\t\tTime\n");
        for (Course course : courses) {
            sb.append(course.toString() + "\n");
        }

        sb.append("\n");

        return sb.toString();
    }
}
