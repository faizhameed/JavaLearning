package Autoboxing;

public class Main {
    public static void main(String[] args) {
        /* Boxing is done because some type like linked list don't support primitive types
        which makes it harder to use int, boolean etc.
*/
//        Integer my_int =  new Integer(4); // deprecated! boxing
        Integer my_int = 6; // autoboxing
        Integer my_int_2  =  Integer.valueOf(8);
        System.out.printf("my_int %d %n", my_int);
        System.out.printf("my_int_2 %d %n", my_int_2);
        // Now my_int can be unboxed
        int unboxed_int = my_int; // int i = my_int.intValue(); can also be done
        System.out.printf("unboxed_int: %d",unboxed_int);
        Float my_float = 3.12F;
        System.out.printf("my float %.2f %n", my_float);
        System.out.printf(my_float.getClass().getName()); // to get class name, but doesn't work on primitive types



        float unboxed_float = my_float ;
        System.out.printf("unboxed float: %.2f",unboxed_float);

            Double resultBoxed = getLiteralDoublePrimitive(); // boxing occurs automatically
            double  resultUnboxed =  getDoubleObject(); // unboxing occurs automaticallly
    }
        private static double getDoubleObject(){
            return Double.valueOf(100.0);
        }
        private static double getLiteralDoublePrimitive(){
        return 100.0;
        }
}
