package Excercises.Polymorphism;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Starting hybrid car!");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving hybrid car!");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Engine is running!");
    }
}
