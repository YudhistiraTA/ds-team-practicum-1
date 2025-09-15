import java.util.Scanner;

public abstract class User {
    private int id;
    private String name;
    private String username;
    private String password;
    protected Scanner scanner;

    public User(int id, String name, String username, String password, Scanner scanner) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Polymorphic method
    public void interact() {
        System.out.println("User interacting with the system.");
    }
}