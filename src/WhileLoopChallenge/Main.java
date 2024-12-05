package WhileLoopChallenge;

public class Main {
    public static void main(String[] args){

        int number = 4;
        int finishNumber = 20;
        int totalEven = 0;
        int totalOdd = 0;
        int found =0;
        while (number<finishNumber){
            if(isEvenNumber(number)){
                if(found<5){
                System.out.printf("Even Number: %d \n",number);
                found++;
                }
                totalEven++;
            }else {
                totalOdd++;
            }

            number++;
        }
        System.out.printf("Even Number found : %d \n", totalEven);
        System.out.printf("Odd Number found : %d \n", totalOdd);
    }

    public static boolean isEvenNumber(int number){
        if((number%2)==0){
            return true;
        }
        return false;
    }
}
