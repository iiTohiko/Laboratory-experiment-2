package laboratory2.dao;

import laboratory2.domain.Course;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDA {
    private ArrayList<Course> courses;

    public CourseDA(String studentNumber) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/scheduleInfo.csv"));

        courses = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] courseInfo = scanner.nextLine().split(",");

            if (studentNumber.equals(courseInfo[0].trim())) {
                courses.add(new Course(courseInfo[1].trim(), courseInfo[2],
                        Integer.parseInt(courseInfo[3].trim()), courseInfo[4].trim(),
                        courseInfo[5].trim()));
            }
        }

        scanner.close();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
