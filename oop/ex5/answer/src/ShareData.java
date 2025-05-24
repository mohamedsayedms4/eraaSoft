public class ShareData extends BaseEntity{
    private String phone;

    public ShareData(int id, String name, String phone) {
        super(id, name);
        setPhone(phone);
    }

    public ShareData() {
        super();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(", Phone: " + phone);
    }
}
