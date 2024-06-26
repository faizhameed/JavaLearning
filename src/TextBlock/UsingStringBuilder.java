package TextBlock;

public class UsingStringBuilder {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        // string is immutable and string builder is mutable
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));// capacity becomes 34 which is automatically increased due to more memory requirement
        StringBuilder emptyStart1 = new StringBuilder(32);
        emptyStart1.append("a".repeat(17)); // capacity is already met on initialization so no memory increase is required here.
        printInformation(emptyStart);
        printInformation(emptyStart1);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16,"g");
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
