import java.util.ArrayList;

public class MobliePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobliePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact> ( );
    }
}
