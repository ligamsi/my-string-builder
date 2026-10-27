
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStringBuilderTest {

    @Test
    void shouldAppendString() {
        MyStringBuilder builder = new MyStringBuilder();

        builder.append("Hello");
        builder.append(" World");

        assertEquals("Hello World", builder.toString());
    }

    @Test
    void shouldUndoAppend() {
        MyStringBuilder builder = new MyStringBuilder();

        builder.append("Hello");
        builder.append(" World");
        builder.undo();

        assertEquals("Hello", builder.toString());
    }

    @Test
    void shouldDeleteSubstring() {
        MyStringBuilder builder = new MyStringBuilder();

        builder.append("Hello World");
        builder.delete(5, 11);

        assertEquals("Hello", builder.toString());
    }

    @Test
    void shouldUndoDelete() {
        MyStringBuilder builder = new MyStringBuilder();

        builder.append("Hello World");
        builder.delete(5, 11);
        builder.undo();

        assertEquals("Hello World", builder.toString());
    }
}
