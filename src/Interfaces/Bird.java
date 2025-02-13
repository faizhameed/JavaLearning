package Interfaces;

public class Bird extends Animal implements Trackable,FlightEnabled{
    @Override
    public void move() {
        System.out.println("Wings on flight!");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off!");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying!");

    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landed");

    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+" coordinates recorded!");

    }
}
