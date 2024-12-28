package Excercises.SmartKitchen;

public class DishWasher {
    boolean hasWorkToDo = false;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Doing dishes");
            setHasWorkToDo(false);
        }
    }
}
