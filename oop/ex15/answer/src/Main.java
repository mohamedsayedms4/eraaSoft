//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student  =  new Student();
        student.setId(11);
        student.setName("John");

        Student student2 =  new Student();
        student2.setId(2);
        student2.setName("mosalah");

        Course course = new Course();
        course.setId(1);
        course.setName("java");
        Course course2 = new Course();
        course2.setId(2);
        course2.setName("python");

            student.getCourses().add(course);
            student.getCourses().add(course2);

            student2.getCourses().add(course);

            course.getStudents().add(student);
            course.getStudents().add(student2);

            course2.getStudents().add(student2);

        System.out.println(student.getCourses().size());
        System.out.println(course.getStudents().size());
        System.out.println(course2.getStudents().get(0).getName());
    }
}