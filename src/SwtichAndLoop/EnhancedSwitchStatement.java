package SwtichAndLoop;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printDayOfWeek(3);
        printDayOfWeek(0);
        printDayOfWeek(5);
        printDayOfWeek(9);

    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Value";
        };
        System.out.println(day + " Stands for " + dayOfWeek);
    }
}
