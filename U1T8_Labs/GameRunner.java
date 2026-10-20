package U1T8_Labs;
// Lab 2
public class GameRunner {
    public static void main(String[] args) {
        Game alexanderHamilton = new Game("Catpetter",4);

        alexanderHamilton.printScores();
        System.out.println(alexanderHamilton.isGameOver());

        alexanderHamilton.addPlayer();
        alexanderHamilton.addPlayer();
        alexanderHamilton.increaseScore(8);

        alexanderHamilton.printScores();
        System.out.println(alexanderHamilton.isGameOver());
        double avg = alexanderHamilton.adverageScorePerPlayer();
        System.out.println(avg);

        alexanderHamilton.increaseScore(4);
        alexanderHamilton.printScores();
        System.out.println(alexanderHamilton.isGameOver());
        avg = alexanderHamilton.adverageScorePerPlayer();
        System.out.println(avg);
    }
}
