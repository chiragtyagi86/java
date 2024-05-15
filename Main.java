import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Main {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        }
    }

    static int getUserAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();
        return age;
    }

    public static void main(String[] args) {
        try {

            int age = getUserAge();

            checkAge(age);

            System.out.println("You are eligible!");
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
