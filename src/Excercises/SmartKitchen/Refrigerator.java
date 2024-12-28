package Excercises.SmartKitchen;

public class Refrigerator {
    boolean hasWorkToDo = false;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (this.hasWorkToDo) {
            System.out.println("Ordering food as per request!!");
            setHasWorkToDo(false);
        }
    }
}
