public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
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

    public void printStudent() {
        System.out.println("ID: " + getId() + ", Name: " + getName());
    }
}
