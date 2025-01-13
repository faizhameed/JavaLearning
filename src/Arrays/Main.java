package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //you can't change the size of the array after the array is instantiated.
        int[] myIntArray = new int[10];
        myIntArray[5] = 50; //indexing starts at 0 to its stored in element 6 as usual
        myIntArray[1] = Integer.parseInt("1");
        System.out.println(myIntArray[1]);
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] first5 = {15, 16, 29, 39, -40};
        int arrayLen = first5.length;
        System.out.println("length of array " + arrayLen);
        System.out.println("last elem " + first5[arrayLen - 1]);
        for (int i = 0; i < arrayLen; i++) {
            System.out.printf("Array at position %d is %d %n", i, first5[i]);
        }
        // alternative way to print with enhanced loop
        int i = 0;
        for (int elem : first5) {
            System.out.printf("Array element at %d %d ", i, elem);
            i++;
        }
        System.out.println(first5);// prints some
        System.out.println("i " + i);
        System.out.println(Arrays.toString(first5)); //Array util to print array values
        // you can create object array to support any kind of values
        Object[] objectArray = new Object[4];
        objectArray[0] = "Faiz";
        objectArray[1] = 5;
        objectArray[2] = 1.001;
        objectArray[3]= new StringBuilder("Hameed");
        System.out.println(Arrays.toString(objectArray));

    }
}
