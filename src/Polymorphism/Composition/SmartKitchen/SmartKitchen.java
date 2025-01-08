package Polymorphism.Composition.SmartKitchen;

public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    private CoffeeMaker brewMaster;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox =new Refrigerator();
    }
    public void setKitchenState(boolean refrigeration, boolean dishwashing , boolean needCoffee){
    iceBox.setHasWorkToDo(refrigeration);
    dishWasher.setHasWorkToDo(dishwashing);
    brewMaster.setHasWorkToDo(needCoffee);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
       dishWasher.doDishes();
        iceBox.orderFood();
    }
    public void addWater(){
    iceBox.hasWorkToDo=true;
    }
    public void pourMilk(){
    brewMaster.hasWorkToDo=true;
    }
    public void loadDishwasher(){
        dishWasher.hasWorkToDo = true;
    }
}

