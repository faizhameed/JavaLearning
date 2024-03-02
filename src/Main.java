//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int levelCompleted = 5;
    int bonus =10;
        int playerOneScore =   calculateScore(true,2,levelCompleted,bonus);
        System.out.println("Player one score " + playerOneScore);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {
        int finalScore = score+1;
        if(gameOver){
            finalScore += (levelCompleted*bonus);
        }
        return finalScore;
    }
}