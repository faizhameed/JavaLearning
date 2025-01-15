package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record GroceryItem(String name, String type, int count) {
    GroceryItem(String name) {
        this(name, "diary", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count,name.toUpperCase(),type);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArr = new GroceryItem[3];
        groceryArr[0] = new GroceryItem("butter");
        groceryArr[1] = new GroceryItem("milk", "diary", 2);
        groceryArr[2] = new GroceryItem("Banana", "fruit", 5);

        System.out.println(Arrays.toString(groceryArr));


        // ArrayList is a type which is dynamic and has additional methods
        GroceryItem sample = new GroceryItem("butter");
        ArrayList objectList = new ArrayList();
        objectList.add(sample);
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();//<> diamond operator
        groceryList.add(sample);
        // GroceryList.add("Yogurt"); // cannot add as it's not the required type;
        groceryList.add(new GroceryItem("peas"));
        groceryList.add(new GroceryItem("carrot","veg",10));
        //add at index
        groceryList.add(1,new GroceryItem("curd"));
        // remove at index
        GroceryItem temp =  groceryList.remove(2);
        System.out.println("Removed "+temp);

        System.out.println(groceryList);

        // Creating Array from ArrayLists
        ArrayList<String> stringList =  new ArrayList();
        stringList.addAll(List.of("jan","feb","mar","apr"));

        String[] stringArr = stringList.toArray(new String[5]); // new element added with default value null
        System.out.println(Arrays.toString(stringArr));

        String[] stringArr2 = stringList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArr2)); // it will still have the exact number of elements


        /*
        ArrayList is dynamic you don't need to specify the array size for it to work
         */


    }
}
