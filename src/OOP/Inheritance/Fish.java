package OOP.Inheritance;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins){
        super(type, weight < 1 ? "small" : weight < 35 ? "medium" : weight<1000? "large":"huge", weight);
        this.gills =gills;
        this.fins   = fins;
    }

    private void moveMuscles(){
        System.out.print("Muscles moving ");
    }
    private void moveBackFin(){
        System.out.print("Backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed== "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
