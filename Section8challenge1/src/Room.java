public class Room {
    private Door door;
    private Tv tv;
    private Bed bed;

    public Room(Door door, Tv tv, Bed bed) {
        this.door = door;
        this.tv = tv;
        this.bed = bed;
    }

    public Door getDoor() {
        return door;
    }

    public Tv getTv() {
        return tv;
    }

    public Bed getBed() {
        return bed;
    }


}
