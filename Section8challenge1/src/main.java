
public class main {
    public static void main(String[] args) {
        Bed bed = new Bed("kronopol", 100, new Dimensions(200,20));
        Tv tv = new Tv("Philips", "Turbo 100", 2017,new Dimensions(47,67));
        Door door = new Door(200,20,50,"Brown");

        Room room = new Room(door,tv,bed);

        room.getBed().getModel();
        room.getTv().getDimensions();
        room.getTvDimensions();
        System.out.println(room.getTv().getModel());


    }
}
