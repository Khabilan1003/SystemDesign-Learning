public class DeluxeRoom implements RoomElement{
    public int roomPrice;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
