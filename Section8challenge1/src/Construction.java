public class Construction {
    private String material;
    private int weight2;



    public Construction(String material, int weight2){
        this.material=material;
        this.weight2=weight2;
    }

    public void displayConstruction(){
        System.out.println("Contruction material: Construction class" );
        System.out.println("Construction weight: Construction class" );
    }

    public String getMaterial() {
        System.out.println(material);
        return material;
    }
}
