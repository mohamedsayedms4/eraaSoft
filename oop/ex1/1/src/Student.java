public class Student {
    private int id;
    private  String name;
    private  int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println("Student id:"+getId());
        System.out.println("Student name:"+getName());
        System.out.println("Student age:"+getAge());
    }
}
