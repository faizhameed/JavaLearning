package Arrays.VaArgs;

public class Main {
    public static void main(String... args) {
        String text = "Hello World Faiz Hameed!";
       String[] splitString =  text.split(" ");
        printText(splitString);
        System.out.println("_".repeat(20));
        String[] text2 = {"where", "are", "you"};
        printText(text2);
        System.out.println(String.join(" ",text2));
    }
    public static void printText(String... textList){ // note the variable arguments (...)
        for(String text:textList){
            System.out.println(text);
        }

    }
}
