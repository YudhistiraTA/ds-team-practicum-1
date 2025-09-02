import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book findBook(String title) {
        return null;
    }

    public void borrowBook(Book book) {}

    public void returnBook(Book book) {}

    public void print() {
    }
}