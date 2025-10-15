package relations;

public class House  {
    private Room room;  // Composición
    private Door door;  //  Composición
    private Owner owner;  // Asociación

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
