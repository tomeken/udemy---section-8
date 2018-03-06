public class Additions {
    private String name;
    private double price;

    public Additions(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        System.out.println("Additions name: " + name);
        return name;
    }

    public double getPrice() {
        System.out.println("Additions price: " + price);
        return price;
    }
}
