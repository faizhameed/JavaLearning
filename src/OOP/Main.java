package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setConvertible(true);
        car.setColor("blue");
        car.setDoors(4);
        car.setMake("Porsche");
        car.setModel("x20");
        car.describeCar();
    }
}
