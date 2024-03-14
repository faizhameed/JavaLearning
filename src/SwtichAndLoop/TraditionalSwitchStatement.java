package SwtichAndLoop;

public class TraditionalSwitchStatement {
    public static void main(String[] args) {
        printDayOfWeek(2);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(0);
        printDayOfWeek(8);
    }
    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                print("Sunday");
                break;
            case 1:
                print("Monday");
                break;
            case 2:
                print("Tuesday");
                break;
            case 3:
                print("Wednesday");
                break;
            case 4:
                print("Thursday");
                break;
            case 5:
                print("Friday");
                break;
            case 6:
                print("Saturday");
                break;
            default:
                print("Invalid Day");

        }
    }

    public static void print(String dayName) {
        System.out.println(dayName);
    }
}
