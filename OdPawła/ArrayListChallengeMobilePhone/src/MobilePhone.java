import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner (System.in);
    private static Contacts contacts = new Contacts ( );


    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        Instructions ( );

        while (!quit) {
            System.out.println ("Enter option: ");
            choice = scanner.nextInt ( );
            scanner.nextLine ( );

            switch (choice) {
                case 0:
                    Instructions ( );
                    break;
                case 1:
                    printContacts ( );
                    break;
                case 2:
                    addContact ( );
                    break;
                case 3:
                    updateContactName ( );
                    break;
                case 4:
                    updateContactNumber ( );
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void Instructions() {
        System.out.println ("\nPress ");
        System.out.println ("\t0 to print instructions");
        System.out.println ("\t1 to print list of contacts");
        System.out.println ("\t2 to add new contact");
        System.out.println ("\t3 to update existing contact name");
        System.out.println ("\t4 to update existing contact phone number");
        System.out.println ("\t5 to remove contact");
        System.out.println ("\t6 to find contact");
        System.out.println ("\t7 quit");
    }

    public static void printContacts() {
        contacts.printContacts ( );
    }

    public static void addContact() {
        System.out.println ("Enter contact name and phone number: ");
        contacts.addContactNameAndPhone (scanner.nextLine ( ), scanner.nextLine ( ));

    }

    public static void updateContactName() {
        System.out.print ("Enter current name: ");
        String currentName = scanner.nextLine ( );
        System.out.print ("Enter new name: ");
        String newName = scanner.nextLine ( );
        contacts.modifyContactName (currentName, newName);
    }

    public static void updateContactNumber() {
        System.out.print ("Enter contact name where you want to edit number ");
        String currentName = scanner.nextLine ( );
        System.out.print ("Enter new phone number ");
        String newPhoneNumber = scanner.nextLine ( );
        contacts.modifyContactNumber (currentName, newPhoneNumber);
    }
}
