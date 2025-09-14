public class App {
    public static void main(String[] args) {
        User user = User.login();
        BookList bookList = new BookList(100);
        new Menu(bookList, user).run();
    }
}
