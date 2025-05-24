public class BaseEntity {
    private int id;
    private String name;

    public BaseEntity(int id, String name) {
        setId(id);
        setName(name);
    }

    public BaseEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  print() {
        System.out.print("ID: " + getId() + ", Name: " + getName());
    }
}
