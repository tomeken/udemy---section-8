public class Hamburger {
    private BreadRoll breadRoll;
    private Meat meat;
    private Additions additions;
    private Additions lettuce;
    private Additions tomato;
    private Additions carrot;
    private Additions cheese;

    public Hamburger(BreadRoll breadRoll, Meat meat, Additions additions) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.additions = additions;
    }
    public Hamburger(BreadRoll breadRoll, Meat meat, Additions lettuce, Additions tomato, Additions carrot, Additions cheese) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.cheese = cheese;

    }

    public void hamburgerPrice() {
        double hamburgerTotalPrice = breadRoll.getPrice() + meat.getPrice() + lettuce.getPrice();
        System.out.println("Hamburger price: " + hamburgerTotalPrice);
    }

}
