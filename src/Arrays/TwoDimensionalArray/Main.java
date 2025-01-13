package Arrays.TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Two ways to declare 2D array
        int[][]  array1 = new int[4][4];
        int[] array2[] = new int[4][4];

        for(int i=0;i<4;i++){
            System.out.println(Arrays.toString(array1[i]));
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
            array1[i][j] = i*10+j+1 ;
        }
        for(int[] arr:array1){
            System.out.println(Arrays.toString(arr));
        }
        array1[1] = new int[]{10,20,90};
        //To print entire 2D array
        System.out.println(Arrays.deepToString(array1));


        // Creating an array that can take any type of value (int, obj, string, etc)
        Object[] anyArray =  new Object[3];
        anyArray[0] = new String[] {"abc", "faiz","hameed"};
        anyArray[1] =  new int[][]{{2, 3, 5},{67,97},{44,7,2}};
        Car car = new Car(2,"creta");
        anyArray[2] = car;
        System.out.println(Arrays.deepToString(anyArray));
    }
}
