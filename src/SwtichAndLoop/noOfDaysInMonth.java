package SwtichAndLoop;

public class noOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(12,1996));
        System.out.println(getDaysInMonth(2,1998));
        System.out.println(getDaysInMonth(2,2004));
    }
    public static boolean isLeapYear(int year){
        if(year<=0 || year%4!=0 || year>9999) return false;
        if(year%100!=0) return true;
        return year%400==0;
    }
    public static int getDaysInMonth (int month, int year){
        if(month<1 || month>12 || year<1|| year>9999)return -1;


        int days = switch(month){
            case 1,3,5,7,8,10,12 ->31;
            case 2 ->isLeapYear(year)?29:28;
            default->30;
        };
        return days;
    }
}
