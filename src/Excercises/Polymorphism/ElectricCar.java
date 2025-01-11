package Excercises.Polymorphism;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("No Engine, its electric! Starting Electric motor!");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving gas electric Car!");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Electric Engine is running");
    }
}
