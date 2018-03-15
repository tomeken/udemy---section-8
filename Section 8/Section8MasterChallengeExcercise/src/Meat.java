public class Meat {
    private String typeOfMeat;
    private double price;

    public Meat(){
        this("Beef", 1.3);
    }

    public Meat(String typeOfMeat, double price) {
        this.typeOfMeat = typeOfMeat;
        this.price = price;
    }

    public String getTypeOfMeat() {
        System.out.println("Type of meat: " + typeOfMeat);
        return typeOfMeat;
    }

    public double getPrice() {
        System.out.println("Meat price: " + price);
        return price;
    }
}
