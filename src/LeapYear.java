public class LeapYear {
    public static boolean isLeapYear (int year){
        if(year<=0 || year%4!=0 || year>9999) return false;
        if(year%100!=0) return true;
        return year%400==0;
    }
}
