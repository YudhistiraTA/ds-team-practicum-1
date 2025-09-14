public class App {
    public static void main(String[] args) {
        Login login = new Login();
        User user = login.login();

        BookList bookList = new BookList(100); // max 100 books
        new Menu(bookList, user).run();
    }
}
