public class Car extends Vehicle {
    private int wheels;
    private String metallic;

    public Car(String metallic) {
        this(true, "Default Car Gearbox: manual", 100, "Default Color: Pink",4,metallic);
        System.out.println("Car with one argument");
    }

    public Car(Boolean steering, String changingGears, int speed, String color, int wheels, String metallic) {
        super(true, changingGears, speed, color);
        this.wheels = wheels;
        this.metallic = metallic;
    }


    public int getWheels() {
        return wheels;
    }

    public String getMetallic() {
        return metallic;
    }
}
