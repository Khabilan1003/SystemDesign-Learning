import java.util.function.DoubleToIntFunction;

public interface RoomVisitor {
    public void visit(SingleRoom room);
    public void visit(DoubleRoom room);
    public void visit(DeluxeRoom room);
}

