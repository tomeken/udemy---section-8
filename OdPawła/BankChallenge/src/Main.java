public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank ("Australia");
        bank.addNewBranch ("Jarosław");
        bank.addCustomer ("Jarosław", "Tim", 50.5);
        bank.addCustomer ("Jarosław", "John", 505.5);
        bank.addCustomer ("Jarosław", "Percy", 30.5);


        bank.addNewBranch ("Sydney");
        bank.addCustomer ("Sydney", "Bob", 150.55);

        bank.addCustomerTransaction ("Jarosław", "Tim", 44.3);
        bank.addCustomerTransaction ("Jarosław", "Tim", 424.3);
        bank.addCustomerTransaction ("Jarosław", "Percy", 44.3);

        bank.listCustomers ("Jarosław", true);
        bank.listCustomers ("Sydney", true);
    }
}
