import java.util.List;

// Abstract base class defines methods to add and show students
public abstract class SchoolBase {
    protected abstract void addStudent(Student student, List<Student> students);
    protected abstract void showStudents(List<Student> students);
    protected abstract void showStudent(Student student);
}
