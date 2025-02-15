package Interfaces;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        animal.move();
        inFlight(bird);
        inFlight(new Jet());
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        LinkedList<FlightEnabled> fliers =  new LinkedList<>();
        List<FlightEnabled> betterFliers  =  new LinkedList<>();
        fliers.add(bird);
        betterFliers.add(bird);

        triggerFlyFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFlyFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }
    private static void triggerFlyFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.takeOff();
        }
    } private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.fly();
        }
    } private static void landFliers(List<FlightEnabled> fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
