package Exercises.Polymorphism2;

public class Ford extends Car {
    public Ford(int cylinders,String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return "Ford " +  super.startEngine();
    }

    @Override
    public String accelerate() {
        return "Ford " +  super.accelerate();
    }

    @Override
    public String brake() {
        return "Ford " +super.brake();
    }
}
