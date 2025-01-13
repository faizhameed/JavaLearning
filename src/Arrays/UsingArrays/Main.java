package Arrays.UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println("Array before sort "+ Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        int[] descArray =  getDescendingArray(firstArray);
        System.out.println("Array after sort "+ Arrays.toString(descArray));

    }

    public static final int[] getRandomArray(int length){
        int[] arrayRand = new int[10];
        Random random =  new Random();
        for(int i =0;i<length;i++){
            int randInt = random.nextInt(100);
            arrayRand[i]=randInt;
        }
        return arrayRand;
    }

    public static final int[] getDescendingArray(int[] array){
        int len = array.length;
        int[] descArr =  new int[len];
       for(int i=len-1,j=0;i>=0;i--,j++){
           descArr[i]=array[j];
       }
       return descArr;
    }

}
