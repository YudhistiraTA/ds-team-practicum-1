import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        // Tambahkan beberapa buku awal
        bookList.addBook(new Book("Clean Code", "Robert C. Martin"));
        bookList.addBook(new Book("Java Programming", "James Gosling"));

        LoginSystem loginSystem = new LoginSystem();
        User user = null;

        // Loop login sampai berhasil
        while (user == null) {
            user = loginSystem.login(scanner);
        }

        // Jalankan menu sesuai user
        Menu menu = new Menu(bookList, user, scanner);
        menu.run();

        System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
        scanner.close();
    }
}