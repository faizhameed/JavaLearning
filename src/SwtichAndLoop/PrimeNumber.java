package SwtichAndLoop;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("List of prime numbers from 1 to 100");
        for(int i=2;i<100;i++){
            if(isPrime(i))
            System.out.println(i);
        }
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return wholeNumber==2;
        }
        for(int divisor =2; divisor<wholeNumber/2;divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }
}
