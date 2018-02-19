public class Vehicle {
    private Boolean steering;
    private String changingGears;
    private int speed;
    private String color;

    public Vehicle() {
        this(true, "Default: manual Gear Box", 0, "Default color: Black");
        System.out.println("Vehicle empty constructor called");
    }

    public Vehicle(int speed, String color) {
        this(true,"Default: manual Gear Box",speed,color);
        System.out.println("Vehicle constructor with 2 defaults called");
    }

    public Vehicle(Boolean steering, String changingGears, int speed, String color) {
        this.steering = steering;
        this.changingGears = changingGears;
        this.speed = speed;
        this.color = color;
    }

    public Boolean getSteering() {
        return steering;
    }

    public String getChangingGears() {
        return changingGears;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int newSpeed){
        this.speed=newSpeed;
    }
}
