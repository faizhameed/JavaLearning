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
        boolean isValidDOB = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi Whats your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for meeting me!");

        int age = 0;
        do {
            System.out.println("What year were you born? ");
            String dateOfBirth = scanner.nextLine();
            age = checkData(currentYear, dateOfBirth);
            isValidDOB = age >= 0;
            if (!isValidDOB)
                System.out.println("Doesn't appear to be a normal valid year of birth! Please enter again.");
        } while (!isValidDOB);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        try {
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;
            if ((dob < minimumYear) || (dob > currentYear)) return -1;

            return currentYear - dob;

        } catch (Exception e) {
            System.out.println("Its looks like you have entered characters that are not numbers!!!");
            return -1;
        }
    }
}
