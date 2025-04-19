import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> history = new ArrayList<>();

    public void addHistory(Memento memento) {
        history.add(memento);
    }

    public Memento undo() {
        if(!history.isEmpty()) {
            int size = history.size();
            Memento memento = history.get(size - 1);
            history.remove(size - 1);
            return memento;
        }
        return null;
    }
}
