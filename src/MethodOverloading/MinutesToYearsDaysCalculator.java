package MethodOverloading;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(-54543);
        printYearsAndDays(5003000);
        printYearsAndDays(0);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
            return;
        }
        long days = minutes/(24*60);
        long years = days/365;
        days = days%365;
        System.out.println(minutes+" min = "+years+" y and "+days+" d"  ) ;
    }

}
