import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default Password Test
        PasswordManager passwordManager = PasswordManager.getInstance();
        System.out.println("Default Password: " + passwordManager.generatePassword());

        // Complex Password Test
        passwordManager.setPasswordGenerationStrategy(new PasswordManager.ComplexPassword());
        System.out.println("Complex Password: " + passwordManager.generatePassword());

        // Simple Password Test
        passwordManager.setPasswordGenerationStrategy(new PasswordManager.SimplePassword());
        System.out.println("Simple Password: " + passwordManager.generatePassword());
    }
}