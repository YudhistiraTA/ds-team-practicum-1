import java.util.Scanner;

public class User {
    private int id;
    private String name;

    public String getName() {
        return name;
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

    public static User login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== LOGIN =====");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your role (admin/member): ");
        String role = scanner.nextLine().trim().toLowerCase();

        User user;
        if (role.equals("admin")) {
            user = new Admin();
        } else {
            user = new Member();
        }

        user.setName(name);
        user.setId(id);

        System.out.println("Welcome, " + user.getName() + " (" + role + ")");
        user.interact();
        return user;
    }
}
