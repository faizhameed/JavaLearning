package SwtichAndLoop;

public class Loop {
    public static void main(String[] args) {
        for (double interestRate = 7.5; interestRate < 10; interestRate+=0.25) {
            System.out.println("10,000 at " + interestRate + "% interest = " + calculateInterest(10000, interestRate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return amount * interestRate / 100;
    }
}
