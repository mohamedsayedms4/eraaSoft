import java.util.ArrayList;
import java.util.List;

public class Student extends  BaseEnitiy{
    private  String name ;
    private List<Email> emails = new ArrayList<Email>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
