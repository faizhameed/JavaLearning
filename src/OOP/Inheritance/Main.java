package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal =new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal,"slow");
        Dog dog = new Dog("Bull",25,"curved","long");
        doAnimalStuff(dog,"fast");

        Dog yoki = new Dog("Yorkie",15);
        doAnimalStuff(yoki,"fast");
        Dog retriever = new Dog("Labrador Retriever",65,"Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Fish goldie = new Fish("Goldfish", 0.25,2,3);
        doAnimalStuff(goldie,"fast");
        Fish blueWhale = new Fish("Blue Whale",130000,2,1);
        doAnimalStuff(blueWhale,"slow");

    }
    public static  void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }
}
