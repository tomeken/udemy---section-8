
public class Fields {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber=  accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void depositFunds(int depositFunds){
        this.balance = this.balance+depositFunds;
    }
    public void withdrawFunds(int withdrawFunds){
        if(withdrawFunds<this.balance){
        this.balance = this.balance - withdrawFunds;
        }
        else
        {
            System.out.println("Account balance: " + this.balance + " is too small to withdraw: " + withdrawFunds);
        }
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }

    public String getEmail() {
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
