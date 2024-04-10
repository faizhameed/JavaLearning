package TextBlock;

public class Main {
    public static void main(String[] args) {
        String bulletit = "Print a bulleted List:\n" + "\u2022 This is the first point\n" + "\u2022 This is the second point\n" + "\t\u2022 This is a sub point\n";
        System.out.println(bulletit);

        String textBlock = """
                Printing a bulleted List:
                   \u2022 First point
                   \u2022 Second point
                       Sub point without a bullet
                       \u2022 sub point with a bullet
                """;
        System.out.println(textBlock);

        int age = 25;
        String name = "faiz";
        System.out.printf("%s age is %d.\nHe is a great football player", name, age);

        int cash = 25;
        System.out.printf("Your in hand cash is %.2f", (float) cash);
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i); //6d gives 6 spaces and align to right
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
        //Alternate way
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        printInformation("Hello Faiz!");
        //empty string
        printInformation("");
        //blank string
        printInformation("    ");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf("r"));
        System.out.printf("last index of l = %d %n", helloWorld.lastIndexOf("l"));

        String helloWorldLower =helloWorld.toLowerCase();
        if(helloWorldLower.equals(helloWorld)){
            // string equals method is case-sensitive
            System.out.println("String matches exactly");
            }
        if(helloWorldLower.equalsIgnoreCase(helloWorld)){
            System.out.println("String matches after ignoring case!");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with 'Hello'");
        }
        if(helloWorld.contains("World")){
            System.out.println("String starts with 'World'");
        }

    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.println("----------");
        System.out.printf("Length =%d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank!");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char =%c %n", string.charAt(length - 1));
    }
}
