public class Main {
    public static void main(String[] args) {
        Car car = new Car("Czarny metallic");
        Combi combi = new Combi("Meallic: Tak","Bagażnik 500 litrów");
        car.setSpeed(150);
        System.out.println("Speed: " + car.getSpeed());
        System.out.println(combi.getCarTrunk());
        System.out.println("Wheels: " + car.getWheels());
    }


}
