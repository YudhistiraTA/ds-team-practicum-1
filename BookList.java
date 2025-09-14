public class BookList {
    private Book[] books;
    private int count;

    public BookList(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Book list is full!");
        }
    }

    public void removeBook(int index) {
        if (index >= 0 && index < count) {
            System.out.println("Book removed: " + books[index].getTitle());
            for (int i = index; i < count - 1; i++) {
                books[i] = books[i + 1];
            }
            books[--count] = null;
        } else {
            System.out.println("Invalid index!");
        }
    }

    public Book findBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void print() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }
        for (int i = 0; i < count; i++) {
            Book b = books[i];
            System.out.println((i + 1) + ". " + b.getTitle() + " by " + b.getAuthor()
                    + (b.isBorrowed() ? " (Borrowed)" : " (Available)"));
        }
    }

    public int getCount() {
        return count;
    }

    public Book getBook(int index) {
        if (index >= 0 && index < count) return books[index];
        return null;
    }
}
