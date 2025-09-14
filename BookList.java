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
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println((i + 1) + ". " + b.getTitle() + " by " + b.getAuthor());
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}