import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String , Integer> context = new HashMap<>();

    public Context() {}

    public void put(String variable , Integer value) {
        context.put(variable , value);
    }

    public Integer get(String variable) {
        return context.get(variable);
    }
}
