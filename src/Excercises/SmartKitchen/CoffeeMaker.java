package Excercises.SmartKitchen;

public class CoffeeMaker {
    boolean hasWorkToDo  =  false;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public  void brewCoffee(){


        if(hasWorkToDo){
        System.out.println("Brewing Coffee!");
        hasWorkToDo=false;
        }
    ;}
}
