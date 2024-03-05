public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));// should return true

        shouldWakeUp(false, 2); //→ should return false since the dog is not barking.

        shouldWakeUp(true, 8); //→ should return false, since it's not before 8.

        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean isBarking, int hour) {
        if (hour < 0 || hour > 23) {
            return false;
        }
        return (hour < 8 || hour > 22) && isBarking;

    }
}
