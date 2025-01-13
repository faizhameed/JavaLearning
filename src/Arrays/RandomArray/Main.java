package Arrays.RandomArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
//        System.out.println(Arrays.toString(firstArray));
//        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray =  Arrays.copyOf(firstArray,firstArray.length);
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));
        // sorting second array doesnt affect first array
        System.out.println(Arrays.toString(firstArray));
        // understand how creating smaller array and larger array works
        int[] smallArray = Arrays.copyOf(secondArray,5);
        int[] largeArray = Arrays.copyOf(secondArray,15);
        System.out.println(Arrays.toString(smallArray));
        System.out.println(Arrays.toString(largeArray));
    }

    public static final int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}

