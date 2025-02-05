package Abstraction;

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;
    public abstract void makeNoise();
    public abstract void move(double speed);

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
}
