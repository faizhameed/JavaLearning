package Exercises.Polymorphism;

public class Car {
    private String description;
    public void startEngine(){
        System.out.println("Engine has started!");
    }
    public void drive(){
        System.out.println("Driver started driving the car!");
    }

    protected void runEngine(){
        System.out.println("Protected runEngine method called!");
    }
}
