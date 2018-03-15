public class DeluxeBurger extends Hamburger {
    private String addition7Name;
    private double addition7Price;
    private String addition8Name;
    private double addition8Price;

    public DeluxeBurger(String meat, double price, String breadRollType) {
        super("Deluxe", meat, price, breadRollType);
        this.addition7Name = "Chips";
        this.addition7Price = 1.2;
        this.addition8Name = "Drinks";
        this.addition8Price = 1.4;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger ();

        hamburgerPrice=hamburgerPrice+this.addition7Price+this.addition8Price;

        return hamburgerPrice;
    }

    //    public void addHamburgerAddition7(String name, double price) {
//        this.addition7Name = name;
//        this.addition7Price = price;
//    }
//    public void addHamburgerAddition8(String name, double price) {
//        this.addition8Name = name;
//        this.addition8Price = price;
//    }
}


