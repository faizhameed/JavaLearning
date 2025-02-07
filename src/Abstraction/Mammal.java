package Abstraction;

abstract class Mammal extends Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    public void shedHair(){
        System.out.println(this.getExplicitType() + " is shedding its hair!");
    }
}
