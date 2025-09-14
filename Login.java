import java.util.Scanner;

public class Login {
    private Scanner scanner = new Scanner(System.in);

    public User login() {
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
