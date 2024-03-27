package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla","x20","green",2,true);
        car.describeCar();

        Car haya = new Car("BMW","T model","black",5,false);
        haya.describeCar();

        Car defaultCar =  new Car();
        defaultCar.describeCar();


        // Create customer
        Customer a1 = new Customer("Faiz","faiz@gmail.com");
        System.out.println(a1.getCreditLimit());
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());

        Customer a2= new Customer("Art",1000,"art@gmail.com");
        System.out.println(a2.getCreditLimit());
        System.out.println(a2.getName());
        System.out.println(a2.getEmail());

        Customer a3= new Customer();
        System.out.println(a3.getCreditLimit());
        System.out.println(a3.getName());
        System.out.println(a3.getEmail());
    }
}
