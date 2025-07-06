package Exercises.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Butcher house", UsageType.RESIDENTIAL));
        mappables.add(new Building("Indian White House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Abu Dhabi", UsageType.SPORTS));
        mappables.add(new UtilityLine("College St", TYPE.FIBER_OPTICS));
        mappables.add(new UtilityLine("Office", TYPE.FIBER_OPTICS));
        mappables.add(new UtilityLine("Fire Station", TYPE.GAS));


        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
