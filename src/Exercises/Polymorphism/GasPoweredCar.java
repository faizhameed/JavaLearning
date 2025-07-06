package Exercises.Polymorphism;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting gas powered car!");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving gas powered car!");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Engine is running!");
    }
}
