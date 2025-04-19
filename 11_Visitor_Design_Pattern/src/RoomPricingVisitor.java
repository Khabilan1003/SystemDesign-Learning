public class RoomPricingVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom room) {
        room.roomPrice = 1000;
        System.out.println("Single Room Price : " + room.roomPrice);
    }

    @Override
    public void visit(DoubleRoom room) {
        room.roomPrice = 2000;
        System.out.println("Double Room Price : " + room.roomPrice);
    }

    @Override
    public void visit(DeluxeRoom room) {
        room.roomPrice = 5000;
        System.out.println("Deluxe Room Price : " + room.roomPrice);
    }
}
