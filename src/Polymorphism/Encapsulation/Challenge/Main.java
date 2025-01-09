package Polymorphism.Encapsulation.Challenge;

public class Main {
    public static void main (String args[]){
    Printer printer = new Printer(50,true);
    System.out.println("initial page count = "+ printer.getPagesPrinted());
    printer.addToner(30);
   int pagesPrinted = printer.printPages(11);
   System.out.println("Pages printed: "+pagesPrinted);
        printer.printPages(8);
        System.out.println("page count = "+ printer.getPagesPrinted());
    }
}
