public class Combi extends Car {
    private String carTrunk;



    public Combi(String metallic,String carTrunk) {
        super(metallic);
        this.carTrunk=carTrunk;
    }

    public Combi(Boolean steering, String changingGears, int speed, String color, int wheels, String metallic,String carTrunk) {
        super(steering, changingGears, speed, color, wheels, metallic);
        this.carTrunk=carTrunk;
    }

    public String getCarTrunk() {
        return carTrunk;
    }
}
