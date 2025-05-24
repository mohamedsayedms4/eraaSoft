public class SchoolMember {
    private String name;
    private int id ;

    public SchoolMember() {
    }

    public SchoolMember(String name, int id) {
        setId(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected void print() {
        System.out.println("Id: " + getId() + " Name: " + getName());
    }
}
