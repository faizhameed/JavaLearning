package Polymorphism.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = ((tonerLevel>=0 && tonerLevel<=100)?tonerLevel : -1);
        this.duplex = duplex;
        this.pagesPrinted =0;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount >100 || tonerAmount < 0){
            return -1;
        }
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }
    public  int printPages(int pages){
        int jobPages = duplex?pages/2+pages%2:pages;
        if(duplex){
            System.out.println("It's a duplex printer");

        }
        pagesPrinted+=jobPages;
        return jobPages;
    }
}
