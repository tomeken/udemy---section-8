public class Hamburger {
    private BreadRoll breadRoll;
    private Meat meat;
    private Additions additions;

    public Hamburger(BreadRoll breadRoll, Meat meat, Additions additions) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.additions = additions;
    }


    public static void main(String[] args) {
        Lettuce lettuce = new Lettuce();
        Tomato tomato = new Tomato();
        Carrot carrot = new Carrot();
        Cheese cheese = new Cheese();
        Meat meat = new Meat();
        BreadRoll breadRoll = new BreadRoll();
        Hamburger hamburger = new Hamburger(breadRoll, meat, tomato);


        lettuce.getName();
        tomato.getName();
        carrot.getName();
        cheese.getName();

        meat.getTypeOfMeat();
        meat.getPrice();

        breadRoll.getBreadRollType();
        breadRoll.getPrice();

        hamburger.additions.getPrice();
        hamburger.breadRoll.getPrice();
        hamburger.meat.getPrice();


        Double breadRollPrice = hamburger.breadRoll.getPrice();
        Double additionsPrice = hamburger.additions.getPrice();
        Double meatPrice = hamburger.meat.getPrice();
        Double hamburherPrice = breadRollPrice + additionsPrice + meatPrice;
        System.out.println("Hamburger Price: " + hamburherPrice);

    }


}
