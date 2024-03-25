package OOP;

public class Car {
    private String make;
    private String model;
    private String color;


    private int doors;
    private boolean convertible;

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    // Constructor overloading
    public Car(){
        // Constructor Chaining
        this("Toyota","Camry","black",5,false);
    }

    //    Getters
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    // Setters
    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "tesla", "holden", "bmw", "toyota", "porsche" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    public void describeCar() {
        System.out.println("Car is of:");
        System.out.println(make + " " + " doors: " +
                doors + " "
                + model
                + " "
                + (convertible ? "Convertible" : ""));
    }

}
