import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contacts = new ArrayList<> ( );
    private ArrayList<String> number = new ArrayList<> ( );

    public void addContactNameAndPhone(String contactName, String phoneNumber) {
        if (findContactNameBool (contactName) == false) {
            contacts.add (contactName);
            number.add (phoneNumber);

        }
        System.out.println ("Contact name already exist" );

    }



    public void printContacts() {
        System.out.println ("Constact list size: " + contacts.size ( ));
        for (int i = 0; i < contacts.size ( ); i++) {
            System.out.println ((i + 1) + ". " + contacts.get (i) + " " + number.get (i));
        }
    }

    public void modifyContactName(String currentName, String newName) {
         int position = findContactName (currentName);
         if (position>=0){
             modifyContactName (position,newName);
         }
    }
    private void modifyContactName(int position, String newName){
        contacts.set (position,newName);
    }

    public void modifyContactNumber(String currentName, String newPhoneNumber){
        int position = findContactName (currentName);
        if (position>=0){
            modifyContactNumber (position,newPhoneNumber);
        }
    }

    private void modifyContactNumber(int position, String newPhoneNumber){
        number.set (position,newPhoneNumber);
    }

    private int findContactName(String contactName) {
        return contacts.indexOf (contactName);
    }
    private boolean findContactNameBool(String contactName){
        return contacts.contains (contactName);
    }
}
