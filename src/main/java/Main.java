public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();

        builder.append("Hello");
        builder.append(" World");
        System.out.println(builder); // Hello World

        builder.undo();
        System.out.println(builder); // Hello

        builder.undo();
        System.out.println(builder); // пустая строка
    }
}