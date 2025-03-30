package Interfaces;

import java.util.Date;

enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring" + this);
        }
    }

    public FlightStages getNextStage() {
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    static  void log(String description){
        var today = new Date();
        System.out.println(today+ ": "+ description);
    }
}

interface FlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();

    void fly();

    void land();

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition is not implemented on " + this.getClass().getName());
//        return null;

        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

    ;
}

interface Trackable {
    void track();
}

record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {
        System.out.println("Dragon fly is taking off!");
    }

    @Override
    public void fly() {
        System.out.println("Dragon fly is flying!");
    }

    @Override
    public void land() {
        System.out.println("Dragon fly sits on a flower or a rock!");
    }
}

class Satellite implements OrbitEarth {
    public void achieveOrbit() {
        System.out.println("Orbit");
    }

    @Override
    public void takeOff() {
        System.out.println("Satellite has launched!");
    }

    @Override
    public void fly() {
        System.out.println("Satellite flies through the space");
    }

    @Override
    public void land() {
        System.out.println("Satellite lands successfully on the earth!");
    }
}

public abstract class Animal {
    public abstract void move();
}
