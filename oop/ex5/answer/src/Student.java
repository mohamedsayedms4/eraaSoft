public class Student extends ShareData{
    private int age ;

    public Student(int id, String name, String phone, int age) {
        super(id, name, phone);
        setAge(age);
    }

    public Student(){
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        super.print();
        System.out.println(", Age: " + getAge());
    }
}
