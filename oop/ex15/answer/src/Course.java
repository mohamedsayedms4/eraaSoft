import java.util.ArrayList;
import java.util.List;

public class Course extends BaseEntity{

    private List<Student> students = new ArrayList<Student>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
