package MethodOverloading;

public class SecondsAndMinutes {
    public static void main(String[] args) {
      System.out.println(getDurationString(3900));
      System.out.println(getDurationString(4000));
    }
    public static String getDurationString (int minutes, int seconds){
        if(minutes<0 || seconds>59 || seconds<0) return "Invalid";
        int hours = minutes/60;
        int balMin = minutes%60;
        return hours + "h " + balMin+"m "+ seconds +"s" ;
    }
    public static String getDurationString (int seconds){
        // convert seconds to minutes and seconds
        if(seconds<0)return "Invalid value";
        int minutes = seconds/60;
        int balanceSeconds = seconds%60;
        return getDurationString(minutes,balanceSeconds);
    }
}
