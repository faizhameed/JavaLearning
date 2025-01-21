package Autoboxing;

public class Main {
    public static void main(String[] args) {
        /* Boxing is done because some type like linked list don't support primitive types
        which makes it harder to use int, boolean etc.
*/
//        Integer my_int =  new Integer(4); // deprecated! boxing
        Integer my_int = 6; // autoboxing
        System.out.printf("my_int %d %n", my_int);
        // Now my_int can be unboxed
        int unboxed_int = my_int; // int i = my_int.intValue(); can also be done
        System.out.printf("unboxed_int: %d",unboxed_int);
    }
}
