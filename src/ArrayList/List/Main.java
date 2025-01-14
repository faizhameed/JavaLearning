package ArrayList.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] items = {"apples", "oranges", "watermelon", "grape","apples"};

        List<String> list = List.of(items);
        // Lists are immutable we can add or remove items
//        List.add("kiwi");
        ArrayList<String> groceriesList =  new ArrayList<>(list);
        System.out.println(groceriesList);
        groceriesList.sort(Comparator.naturalOrder());
        System.out.println(groceriesList);


        groceriesList.removeAll(List.of("apples"));// every apple in the list will be removed
        System.out.println(groceriesList);
        groceriesList.retainAll(List.of("watermelon","grape"));// oranges will be removed
        System.out.println(groceriesList);
        // clear all items
        groceriesList.clear();
        System.out.println(groceriesList);
        System.out.printf("is grocery list empty %b",groceriesList.isEmpty());
    }
}
