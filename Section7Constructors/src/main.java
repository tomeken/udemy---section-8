public class main {
    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer("John",125);
        System.out.println("Credit limit: " + vipCustomer.getCreditLimit());
        System.out.println("Name: " + vipCustomer.getName());
        System.out.println("email: " + vipCustomer.getEmailAddress());
    }
}
