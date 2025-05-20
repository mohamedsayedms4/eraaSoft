import java.util.List;

// Implementation for showing students
public class ShowStudentImpl extends SchoolBase {

    @Override
    public void addStudent(Student student, List<Student> students) {
        // No implementation needed here for this class
    }

    @Override
    public void showStudents(List<Student> students) {
        System.out.println("You are show All students");
        for (Student student : students) {
            student.printStudent();
        }
    }

    @Override
    public void showStudent(Student student) {
        // Custom way to show a single student
        System.out.println(student.getId() + "   " + student.getName());
    }
}
