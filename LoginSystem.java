import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginSystem {
    private List<User> users;

    public LoginSystem(Scanner scanner) {
        users = new ArrayList<>();
        // Tambahkan user admin dan member contoh
        users.add(new Admin(1, "Admin Alice", "admin01", "adminpass", scanner));
        users.add(new Member(2, "Member Bob", "member01", "memberpass", scanner));
    }

    public User login(Scanner scanner) {
        System.out.println("=== Sistem Login Perpustakaan ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                System.out.println("Login berhasil. Selamat datang, " + user.getName() + "!");
                return user;
            }
        }
        System.out.println("Login gagal: username atau password salah.");
        return null;
    }
}