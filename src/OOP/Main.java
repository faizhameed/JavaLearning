package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla","x20","green",2,true);
        car.describeCar();

        Car haya = new Car("BMW","T model","black",5,false);
        haya.describeCar();

        Car defaultCar =  new Car();
        defaultCar.describeCar();
    }
}
