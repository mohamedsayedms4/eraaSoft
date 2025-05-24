public class Player extends ShareData{

    private int number;

    public Player(int id, String name, String phone, int number) {
        super(id, name, phone);
        setNumber(number);
    }

    public Player() {
        super();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(", Number: " + getNumber());
    }
}
