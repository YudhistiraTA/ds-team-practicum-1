public class App {
    public static void main(String[] args) {
        Login login = new Login();
        User user = login.login();

        new Menu(
                new BookList(),
                user
        ).run();
    }
}
