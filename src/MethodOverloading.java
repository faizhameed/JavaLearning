public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore(1);
        System.out.println(calculateScore(4, 2));
        System.out.println(calculateScore(4, 2, 3));
        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(2, 3));
    }

    public static int calculateScore(int a, int b) {
        return a * b;
    }

    public static void calculateScore(int a) {
        System.out.println("need one more params " + a);
    }

    public static int calculateScore(int a, int b, int c) {
        return calculateScore(a, b) * c;
    }

    public static double convertToCentimeters(int heightInInches) {

        return (double) heightInInches * 2.54;
    }

    public static double convertToCentimeters(int hfeet, int hinch) {
        hinch += hfeet * 12;
        return convertToCentimeters(hinch);
    }
}
