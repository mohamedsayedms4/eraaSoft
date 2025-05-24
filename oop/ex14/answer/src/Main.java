//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setName("John");

        Email email = new Email();
        email.setId(1);
        email.setEmail("ms4002@fayoum.edu");
        email.setNumber("1225");

        Email email2 = new Email();
        email2.setId(20);
        email2.setEmail("ggyy550@fayoum.edu");
        email2.setNumber("300660");

        student.getEmails().add(email);
        student.getEmails().add(email2);

        email.setStudent(student);
        email2.setStudent(student);

        System.out.println(student.getEmails().get(0).getEmail());
        System.out.println(student.getEmails().get(1).getEmail());
        System.out.println(email.getStudent().getName());
    }
}