package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla","x20","green",2,true);
        car.describeCar();
        car.setOwner("Faiz");
        System.out.println(car.getOwner());
        Car haya = new Car("BMW","T model","black",5,false);
        haya.describeCar();

        // this can change owner of the other Car instance as well
        haya.setOwner("Haya");
        System.out.println("Car owners:");
        System.out.println(haya.getOwner());
        System.out.println(car.getOwner());// owner has been changes for all;


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
