import java.util.Scanner;

public class Login {
    private Scanner scanner = new Scanner(System.in);

    public User login() {
        System.out.println("===== LOGIN =====");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Are you an admin? (y/n): ");
        String isAdmin = scanner.nextLine().trim().toLowerCase();

        User user;
        if (isAdmin.equals("y")) {
            user = new Admin();
        } else {
            user = new Member();
        }
        user.setName(name);

        System.out.println("Welcome, " + user.getName() + "!");
        return user;
    }
}
