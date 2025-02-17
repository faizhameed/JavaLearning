package Interfaces;

public class Jet implements FlightEnabled, Trackable {

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off!");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying!");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landed");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightStages.CRUISE;
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " coordinates recorded!");
    }
}
