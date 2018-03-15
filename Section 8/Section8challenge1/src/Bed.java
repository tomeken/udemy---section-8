public class Bed {
    private String model;
    private int weight;
    private Dimensions dimensions;


    public  Bed(String model, int weight, Dimensions dimensions) {
        this.model = model;
        this.weight = weight;
        this.dimensions =dimensions;
    }

    public String getModel() {
        System.out.println("Bed model: " + model);
        return model;
    }

    public int getWeight() {
        return weight;
    }
}
