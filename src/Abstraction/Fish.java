package Abstraction;

public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if (type == "GoldFish") {
            System.out.println("Swish!!");
        } else {
            System.out.println("Splash");
        }
    }

    @Override
    public void move(double speed) {
        if (speed > 10) {
            System.out.println(getExplicitType() + " Fish is swimming slowly");
        } else {
            System.out.println(getExplicitType() + " Fish is swimming frantically!");

        }
    }
}
