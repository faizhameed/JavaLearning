package ReadingUserInput;

import java.util.Scanner;

public class SumOfFive {
    public static void main(String[] args) {

        try {
            getInputFromConsole();
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner());
        }
    }
public static void getInputFromConsole(){
String numberString = System.console().readLine();
// Same are the getInputFromScanner if running in terminal;
}
public static String getInputFromScanner() {

    Scanner scanner = new Scanner(System.in);
    boolean isValid = false;
    int count = 0;
    int sum=0;
    do {
        try {
            System.out.println("Enter a number in position " + (count + 1) + ":");
            String numberString = scanner.nextLine();
            int number = Integer.parseInt(numberString);
            isValid = true;
            if(isValid){
            count++;
            sum+=number;
            }
        } catch (NumberFormatException e) {
            System.out.println("That's an invalid number");
            isValid = false;
        }

    } while (!isValid || count < 5);
    return "Sum of the five numbers entered: " + sum;
}

}
