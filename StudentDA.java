package laboratory2.dao;

import laboratory2.domain.Student;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDA {
    private ArrayList<Student> students;

    public StudentDA(String blockSection) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/studentInfo.csv"));

        students = new ArrayList<Student>();

        while (scanner.hasNextLine()) {
            String[] studentInfo = scanner.nextLine().split(",");

            if (blockSection.equals(studentInfo[0])) {
                CourseDA courseDA = new CourseDA(studentInfo[1]);

                students.add(new Student(studentInfo[1].trim(),
                        studentInfo[2].trim(), studentInfo[3].trim(),
                        courseDA.getCourses()));
            }
        }
        scanner.close();
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
