package ArrayList.ArrayAndArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] originalArr =  new String[]{"one","two","three"};
        var originalList = Arrays.asList(originalArr);

        System.out.println(Arrays.toString(originalArr));
        System.out.println(originalList);

        originalList.sort(Comparator.naturalOrder());
        System.out.println("after sorting!");
        System.out.println(Arrays.toString(originalArr));
        System.out.println(originalList);

        //remove item
//        originalList.remove(1); // Not allowed

        System.out.println(Arrays.toString(originalArr));
        System.out.println(originalList);


    }
}
