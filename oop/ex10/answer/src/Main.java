import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // Create instances of both implementations
        SchoolBase addImpl = new AddStudentImpl();
        SchoolBase showImpl = new ShowStudentImpl();

        // Create some students
        Student s1 = new Student("Ali", 1);
        Student s2 = new Student("Sara", 2);

        // Use AddStudentImpl to add students (prints message)
        addImpl.addStudent(s1, students);
        addImpl.addStudent(s2, students);

        // Use ShowStudentImpl to display all students (prints message)
        showImpl.showStudents(students);

        // Use ShowStudentImpl to display single student
        showImpl.showStudent(s1);
    }
}