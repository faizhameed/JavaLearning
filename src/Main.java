//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int levelCompleted = 5;
        int bonus = 10;
        int playerOneScore = calculateScore(true, 2, levelCompleted, bonus);
        System.out.println("Player one score " + playerOneScore);
        int highScorePosition = CalculateHighScorePosition(1500);
        displayHighScorePosition("Faiz", highScorePosition);

      highScorePosition = CalculateHighScorePosition(900);
        displayHighScorePosition("Walter", highScorePosition);
        highScorePosition = CalculateHighScorePosition(450);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = CalculateHighScorePosition(050);
        displayHighScorePosition("Gig", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score + 1;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + "managed to get into position " + position + " on the high score list");
    }

    public static int CalculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;
    }
}