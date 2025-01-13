package Excercises.Polymorphism;

public class Main {
    public static void main(String[] args) {
    Car mustang = new HybridCar(); // Car can be used since Hybrid car extends Car class
    mustang.drive();
    mustang.startEngine();
    mustang.runEngine();
    }
}
