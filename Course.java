package laboratory2.domain;

public class Course {
private String courseCode;
private String description;
private Integer unit;
private String day;
private String time;

public Course(String courseCode, String description, Integer unit, String day, String time) {
        this.courseCode = courseCode;
        this.description = description;
        this.unit = unit;
        this.day = day;
        this.time = time;
        }

public String getCourseCode() {
        return courseCode;
        }

public String getDescription() {
        return description;
        }

public void setDescription(String description) {
        this.description = description;
        }

public Integer getUnit() {
        return unit;
        }

public String getDay() {
        return day;
        }

public void setDay(String day) {
        this.day = day;
        }

public String getTime() {
        return time;
        }

public void setTime(String time) {
        this.time = time;
        }

@Override
public String toString() {
        return courseCode + "\t\t" + description + "\t" + unit + "\t\t" + day + "\t\t" + time;
        }
}
