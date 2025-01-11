package Excercises.Polymorphism2;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi " + super.startEngine();
    }

    @Override
    public String accelerate() {
        return "Mitsubishi " + super.accelerate();
    }

    @Override
    public String brake() {
        return "Mitsubishi " + super.brake();
    }
}
