import java.math.BigInteger;

public class BankAccount {
    public static void main(String[] args) {
        Fields fields = new Fields();
        fields.setAccountNumber(541111464);
        int AccountNumber = fields.getAccountNumber();
        fields.setBalance(100);

        fields.setCustomerName("John");
        String customerName = fields.getCustomerName();
        fields.setEmail("Tomasz@gmail.com");
        String email = fields.getEmail();
        fields.setPhoneNumber(2245395);
        int phoneNumber = fields.getPhoneNumber();
        fields.depositFunds(200);
        fields.withdrawFunds(500);
      //  int currentBalance = fields.getAdditionalMoney();
        int balance = fields.getBalance();

        System.out.println("Account number: " + AccountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Customer Name: " + customerName);
        System.out.println("email: " + email);
        System.out.println("phone number: " + phoneNumber);
    //    System.out.println("additional money: " + currentBalance);
    }

}
