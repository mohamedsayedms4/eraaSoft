public class PublicSchool extends SchoolMember {

    public PublicSchool() {
        super();
    }

    public PublicSchool(String name, int id) {
        super(name, id);
    }
    @Override
    public void print() {
        System.out.println("---PuplicSchool---");
        super.print();

    }
}
