package Polymorphism.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name,100,"Swords");

    }

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.restoreHealth(0);
    }

    public void loseHealth(int damage){
        health =health-damage;
        if(health<=0){
            System.out.println("Player Knocked out of the game!");
        }
    }
    public int healthRemaining(){
        return  health;
    }
    public void restoreHealth(int extraHealth){

        health = health +extraHealth;
        if(health>100){
            System.out.println("Player restored to 100%");
            health=100;
        }
    }
}
