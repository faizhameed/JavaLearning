package TextBlock;

public class Main {
    public static void main(String[] args) {
         String bulletit = "Print a bulleted List:\n"+"\u2022 This is the first point\n"+"\u2022 This is the second point\n"+"\t\u2022 This is a sub point\n";
         System.out.println(bulletit);

         String textBlock= """
                 Printing a bulleted List:
                    \u2022 First point
                    \u2022 Second point
                        Sub point without a bullet
                        \u2022 sub point with a bullet
                 """;
         System.out.println(textBlock);
    }
}
