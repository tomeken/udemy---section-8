public class BreadRoll {
    private String breadRollType;
    private double price;

    public BreadRoll() {
        this.breadRollType = "Sezam roll";
        this.price = 0.8;
    }

    public String getBreadRollType() {
        System.out.println("Bread toll type: " + breadRollType);
        return breadRollType;
    }

    public double getPrice() {
        System.out.println("Bread roll price: " + price);
        return price;
    }
}
