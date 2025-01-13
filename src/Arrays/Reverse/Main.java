package Arrays.Reverse;

import java.util.Arrays;

public class Main {
    private static void reverse(int[] array){
        int len =array.length;
        int halfLen = len/2;
        System.out.println("Array = "+ Arrays.toString(array));
        for(int i=0;i<halfLen;i++){
            int temp = array[i];
            array[i]= array[len-1-i];
            array[len-1-i]=temp;
        }
        System.out.println("Reversed array = "+ Arrays.toString(array));
    }
}
