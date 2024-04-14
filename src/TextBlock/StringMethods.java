package TextBlock;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "05/09/2003";
        int startingIndex = birthDate.indexOf("2003");
        System.out.println(startingIndex);
        System.out.println("Birth year = "+ birthDate.substring(startingIndex));
//        add 10 to birthyear
        int current = Integer.parseInt(birthDate.substring(startingIndex))+10;
        System.out.println(current);
        String newDate = String.join("/","10","03","1993");
        System.out.println("Month = "+ birthDate.substring(3,5));

        System.out.println(newDate);
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1983");

        System.out.println("newDate with concat = "+newDate);
        newDate = "25"+"/"+"12"+"/"+"2003";
        System.out.println("NewDate with pls operator = "+newDate);

        newDate = newDate.replace("/","-");
        System.out.println("NewDate after replace = "+newDate);

        System.out.println("ABC\n".repeat(3).indent(10)); //indent put space
        System.out.println("-".repeat(20));



    }
}
