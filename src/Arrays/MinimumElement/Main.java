package Arrays.MinimumElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String numberString = scanner.nextLine();
        int number = Integer.parseInt(numberString);
        return number;
    }

    public static int[] readElements(int len) {
        Scanner scanner  =  new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter an Integer: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        return array;
    }
    public static int findMin(int[] array){
        int smallest=array[0];
        for(int i=1;i<array.length;i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        return smallest;
    }
}
