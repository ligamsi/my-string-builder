import java.util.ArrayDeque;
import java.util.Deque;

public class MyStringBuilder {

    private final java.lang.StringBuilder value = new java.lang.StringBuilder();
    private final Deque<String> history = new ArrayDeque<>();

    public MyStringBuilder append(String str) {
        saveSnapshot();
        value.append(str);
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        saveSnapshot();
        value.delete(start, end);
        return this;
    }

    public MyStringBuilder undo() {
        if (!history.isEmpty()) {
            String previousState = history.pop();

            value.setLength(0);
            value.append(previousState);
        }
        return this;
    }

    private void saveSnapshot() {
        history.push(value.toString());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}