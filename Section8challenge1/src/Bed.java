public class Bed {
    private String model;
    private int weight;
    private Construction construction;


    public  Bed(String model, int weight, Construction construction) {
        this.model = model;
        this.weight = weight;
        this.construction=construction;
    }

    public void bedDetails(){
        System.out.println("Bed model: " + model);
        System.out.println("Bed weight: " + weight);
    }
    public void badDetails2(){
        construction.displayConstruction();
    }

    public Construction getConstruction() {
        return construction;
    }
}
