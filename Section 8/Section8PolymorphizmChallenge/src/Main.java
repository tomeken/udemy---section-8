 class Car {
    String engine;
    int cylinders;
    int wheels;
    String color;
    int doors;
    String name;
    int speed;

    public Car(String engine, String color, String name) {
        this(engine, 4, 4, color, 4, name,0);

    }


    public Car(String engine, int cylinders, int wheels, String color, int doors, String name, int speed) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.color = color;
        this.doors = doors;
        this.name = name;
        this.speed = speed;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void startEngine(){
        System.out.println("Engine is ON");
    }
    public void accelerate(int accelerateValue){
        this.speed += accelerateValue;
        System.out.println("Car acceleration: " + accelerateValue);
    }
    public void breakCar(){
        this.speed = 0;
        System.out.println("Car stopped");
    }



}
class Octavia extends Car{
    public Octavia() {
        super("1.6 TDI CR", "Color: Black", "Octavia");
    }

    @Override
    public void startEngine(){
        System.out.println("1: Wcisnij sprzęgło " +
                "\n2: Przekręć kluczyk " +
                "\n3: Engine is ON");
    }
}
 public class Main {
     public static void main(String[] args) {
         Car car = new Car("Diesel","Black","Octavia");
         car.startEngine();
         car.accelerate(60);
         car.accelerate(60);
         System.out.println("Car speed: " + car.getSpeed());
         car.breakCar();
         System.out.println("Car speed: " + car.getSpeed());

         Car octavia = new Octavia();
         octavia.startEngine();
         System.out.println("Octavia speed: " + octavia.getSpeed());
         octavia.accelerate(50);
         System.out.println("Octavia speed: " + octavia.getSpeed());
         System.out.println("Octavia engine: " + octavia.getEngine());
         System.out.println("Octavia cylinders: " + octavia.getCylinders());
     }
 }
