package ReadingUserInput;

import java.util.Scanner;

// run the program in console java src/ReadingUserInput/ReadingUserInput.java
public class ReadingUserInput {
    public static void main(String[] args) {
        try {
            System.out.println(getInputFromConsole(2024));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(2024));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi Whats your name? ");
        System.out.println("Hi " + name + ", Thanks for meeting me!");
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi Whats your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for meeting me!");

        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }
}
