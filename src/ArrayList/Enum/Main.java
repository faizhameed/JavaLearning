package ArrayList.Enum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        enum DayOfTheWeek {
            SUNDAY, MONDAY
        }
        MonthInAYear monthTest = getRandomMonth();
        System.out.printf("Name is %s, ordinal value = %d%n", monthTest.name(), monthTest.ordinal());
        System.out.println(DayOfTheWeek.MONDAY);
        System.out.println(MonthInAYear.APRIL);
        for(int i=0;i<20;i++){
        MonthInAYear month = getRandomMonth();
        switchMonth(month);
        }
        for(Topping topping:Topping.values()){
            System.out.println(topping.name().charAt(0)+topping.name().substring(1).toLowerCase()+" : "+ topping.getPrice());
        }
    }

    public static MonthInAYear getRandomMonth() {
        int randomInt = new Random().nextInt(12);
        var months = MonthInAYear.values();
        return months[randomInt];
    }

    public static void switchMonth(MonthInAYear month){
        switch (month){
            case MAY -> System.out.println("Month is May!");
            case AUGUST -> System.out.println("Month is August!");
            case SEPTEMBER-> System.out.println("Month is Sept!");
            case OCTOBER-> System.out.println("Month is Oct!");
            case NOVEMBER-> System.out.println("Month is Nov!");
            case DECEMBER-> System.out.println("Month is Dec!");
            default -> {
                String currMonth = month.name().charAt(0) + month.name().substring(1).toLowerCase();
                System.out.printf("Month not in default and its %s %n", currMonth);
            }
        }
    }
}


