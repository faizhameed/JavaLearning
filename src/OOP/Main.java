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

        Car haya = new Car();
        haya.setConvertible(true);
        haya.setColor("green");
        haya.setDoors(4);
        haya.setMake("tesla");
        haya.setModel("T");
        haya.describeCar();
    }
}
