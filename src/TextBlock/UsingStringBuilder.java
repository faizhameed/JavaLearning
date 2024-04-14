package TextBlock;

public class UsingStringBuilder {
    public static void main(String[] args) {
       String helloWorld = "Hello" +"World";
       helloWorld.concat(" and Goodbye");
       StringBuilder helloWorldBuilder = new StringBuilder("Hello" +"World");
       helloWorldBuilder.append(" and Goodbye");
       // string is immutable and string builder is mutable
       printInformation(helloWorld);
       printInformation(helloWorldBuilder);
    }
    public static void  printInformation(String string){
        System.out.println("String = " + string );
        System.out.println("Length = "+ string.length() );

    }

    public static void  printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder );
        System.out.println("Length = "+ builder.length());
    }
}
