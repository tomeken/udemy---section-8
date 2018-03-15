import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);
    private static GroceryList groceryList = new GroceryList ( );

    public static void main(String[] args) {

        Instructions ( );
        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println ("Enter you choice: ");
            choice = scanner.nextInt ( );
            scanner.nextLine ( );

            switch (choice) {
                case 0:
                    Instructions ( );
                    break;
                case 1:
                    groceryList.printGroceryList ( );
                    break;
                case 2:
                    addItem ( );
                    break;
                case 3:
                    modifyItem ( );
                    break;

            }
        }
    }

    public static void Instructions() {
        System.out.println ("\nPress ");
        System.out.println ("\t 0 - To print choice options.");
        System.out.println ("\t 1 - To print the list of grocery items.");
        System.out.println ("\t 2 - To add an item to the list.");
        System.out.println ("\t 3 - To modify an item in the list.");
        System.out.println ("\t 4 - To remove an item from the list.");
        System.out.println ("\t 5 - To search for an item in the list.");
        System.out.println ("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println ("Please enter item which you want to add: ");
        groceryList.addGroceryItem (scanner.nextLine ( ));

    }

    public static void modifyItem(){
        System.out.println ("Enter item number: " );
        int itemNo = scanner.nextInt ();
        System.out.println ("Enter replacement item: " );
        scanner.nextLine ();
        String newItem = scanner.nextLine ();
        groceryList.modifyGroceryList (itemNo-1,newItem);
    }
}
