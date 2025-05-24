//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Student ID must be > 0");
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 7 && age < 30) {
            this.age = age;
        } else {
            System.out.println("Student Age must be > 7 and < 30");
        }

    }

    public void print() {
        System.out.println("Student ID  : " + this.getId());
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Age : " + this.getAge());
    }
}
