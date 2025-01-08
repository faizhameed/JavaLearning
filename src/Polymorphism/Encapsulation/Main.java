package Polymorphism.Encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Faiz",399,"Sword");
                int damage = 10;
                player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

    }
}
