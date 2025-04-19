public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom room) {
        System.out.println("Performing Room Maintenance for Single Room");
    }

    @Override
    public void visit(DoubleRoom room) {
        System.out.println("Performing Room Maintenance for Double Room");
    }

    @Override
    public void visit(DeluxeRoom room) {
        System.out.println("Performing Room Maintenance for Deluxe Room");
    }
}
