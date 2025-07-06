package Exercises.Polymorphism2;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden " +        super.startEngine();
    }

    @Override
    public String accelerate() {
        return "Holden " +    super.accelerate();
    }

    @Override
    public String brake() {
        return "Holden " +  super.brake();
    }
}
