package Arrays.TwoDimensionalArray;

public class Car{
    private int wheels;
    private String name;

    public Car(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}