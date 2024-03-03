public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(25.42);
        printConversion(1.5);
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double conversion = 1.609;
        return Math.round(kilometersPerHour / conversion);
    }

    public static void printConversion(double kmph) {
        if (kmph < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(kmph + " km/h = " + toMilesPerHour(kmph) + " mi/h");
        }
    }


}
