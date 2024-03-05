public class DecimalComparator {
    // write code here
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1000,1000.12));
    }
    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        a*=1000;
        b*=1000;
        return (int) a == (int) b;
    }
}
