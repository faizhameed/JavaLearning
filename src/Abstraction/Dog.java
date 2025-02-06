package Abstraction;

public class Dog extends Animal {
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Howling!");
        } else
            System.out.println("Boow boow!!");
    }

    @Override
    public void move(double speed) {
        System.out.printf("%s Dog is moving at a speed of %.2f %n",getExplicitType(), speed);
    }
}
