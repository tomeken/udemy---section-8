public class Main {
    public static void main(String[] args) {
        BreadRoll breadRoll = new BreadRoll();
        Meat meat = new Meat();
        Additions additions = new Carrot();
        additions.getPrice();
        Hamburger hamburger = new Hamburger(breadRoll,meat,additions);
      //  hamburger.hamburgerPrice();


    }
}
