//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SchoolMember privateSchool = new PrivateSchool();
        SchoolMember publicSchool = new PublicSchool();

        privateSchool.setId(12);
        privateSchool.setName("Mohamed");
        publicSchool.setId(14);
        publicSchool.setName("Ahmed");

        privateSchool.print();
        publicSchool.print();
    }
}