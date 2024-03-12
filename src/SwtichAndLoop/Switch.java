package SwtichAndLoop;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {

            case 0:
                System.out.println("its 0");
                break;
            case 1:
                System.out.println("No Its one");
                break;
            default:
                System.out.println("its none of them,");

        }
        switchValue = 3;
// Enhanced switch statement
        switch (switchValue) {
            case 0 -> System.out.println("its 0");
            case 1 -> System.out.println("No Its one");
            default -> System.out.println("its none of them,");
        }
        System.out.println(YieldSwitch(3) + " is the string");
    }
// Switch statement with Yield

    public static String YieldSwitch(int switchValue) {

        return switch (switchValue) {
            case 0 -> "cool";
            case 1 -> "meow";
            default -> {
                String name = "Faiz";
                yield name;
            }
        };
    }
}
