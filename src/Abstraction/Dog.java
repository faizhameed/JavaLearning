package Abstraction;

public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Boow boow!!");
    }
    @Override
    public void move(double speed) {
        System.out.printf("Dog is moving at a speed of %.2f %n",speed);
    }
}
