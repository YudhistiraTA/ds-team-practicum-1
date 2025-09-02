public class App {
    public static void main(String[] args) {
        new Menu(
                new BookList(),
                new Member())
                .run();
    }
}