package laboratory2.domain;

import java.util.List;

public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private List<Student> students;

    public BlockSection(String blockCode, String description, String adviser, List<Student> students) {
        this.blockCode = blockCode;
        this.description = description;
        this.adviser = adviser;
        this.students = students;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdviser() {
        return adviser;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Block Section Code: " + blockCode + "\n");
        sb.append("Description: " + description + "\n");
        sb.append("Adviser: " + adviser + "\n\n");
        sb.append("Total Students: " + students.size() + "\n\n");

        for (Student student : students) {
            sb.append(student.toString());
        }

        return sb.toString();
    }
}