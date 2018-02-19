
public class main {
    public static void main(String[] args) {
        Construction construction = new Construction("metal", 25);
        Bed bed = new Bed("hilding",20, construction);
     //   bed.bedDetails();
        bed.badDetails2();
        Tv tv = new Tv("Philips", "Super 100", 2017);
        System.out.println("Model TV to: " + tv.getModel());
        bed.getConstruction().getMaterial();
    }
}
