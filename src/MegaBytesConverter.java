public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = kilobytes / 1024;
        int remainingKB = kilobytes - megabytes * 1024;

        System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainingKB + " KB");
    }
}
