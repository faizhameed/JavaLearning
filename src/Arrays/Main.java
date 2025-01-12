package Arrays;

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

        int[] first5 = {15,16,29,39,-40};
        int arrayLen = first5.length;
        System.out.println("length of array "+ arrayLen );
        System.out.println("last elem " + first5[arrayLen-1]);
        for(int i=0;i<arrayLen;i++){
            System.out.printf("Array at position %d is %d %n",i,first5[i]);
        }
    }
}
