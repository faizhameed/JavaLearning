package OOP.Inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "large", 45);
        this.earShape = earShape;

        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    // this overrides parent class method makenoise
    public void makeNoise() {
        System.out.println("Dogs make boo boo noise");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs run, walk and wag tail!");
    }
}
