//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "John", "123", 23);
        Person person = new Person(1,"Mohamed");
        Player player = new Player(15,"ali","01000780900",11);
        person.print();
        System.out.println("");
        student.print();
        player.print();

    }
}