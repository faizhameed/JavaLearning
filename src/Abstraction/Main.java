package Abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Dog murger =  new Dog("butcher","L",34.5);
//    murger.move(34);
//    murger.makeNoise();
    Dog wolfBane = new Dog("Wolf","S",24.5);
    wolfBane.makeNoise();
//    doAnimalStuff(murger);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(murger);
        animals.add(wolfBane);
        animals.add(new Fish("GoldFish","Small",0.5));
        animals.add(new Fish("Angel","Very small",0.02));

        for(Animal animal:animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal){
                ((Mammal) animal).shedHair  ();
            }
        }
    }
    private static  void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move(100);
    }

}
