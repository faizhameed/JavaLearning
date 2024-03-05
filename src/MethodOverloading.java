public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore(1);
        System.out.println(calculateScore(4,2));
        System.out.println(calculateScore(4,2,3));
    }
    public static int calculateScore (int a, int b){
        return  a * b;
    }
    public static void calculateScore(int a){
        System.out.println("need one more params");
    }
    public static int calculateScore (int a, int b, int c){
        return  calculateScore(a,b) * c;
    }
}
