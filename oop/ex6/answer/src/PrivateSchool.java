public class PrivateSchool extends SchoolMember {
    public PrivateSchool() {
        super();
    }

    public PrivateSchool(String name, int id) {
        super(name, id);
    }

    @Override
    public void print() {
        System.out.println("---PrivateSchool---");
        super.print();
    }
}
