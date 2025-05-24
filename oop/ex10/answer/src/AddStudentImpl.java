import java.util.List;

// Implementation for adding students with message
public class AddStudentImpl extends SchoolBase {

    @Override
    public void addStudent(Student student, List<Student> students) {
        System.out.println("You are add student");
        students.add(student);
    }

    @Override
    public void showStudents(List<Student> students) {
        // No implementation needed here for this class
    }

    @Override
    public void showStudent(Student student) {
        // No implementation needed here for this class
    }
}
