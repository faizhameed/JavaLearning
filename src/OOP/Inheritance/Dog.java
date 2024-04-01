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

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed=="slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }
    public void bark(){
        System.out.println("Woof!!");
    }
    public void run(){
        System.out.println("Dog Running!");
    }

    public void walk(){
        System.out.println("Dog Walking!");
    }
    public void wagTail(){
        System.out.println("Tail Wagging!");
    }
}
