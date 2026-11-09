package U1T8_Labs;
// Lab 2
public class Game {
    private String gameName;
    private int players;
    private int score = 0;

    public Game(String name, int players) {
        gameName = name;
        this.players = players;
    }

    public String getGameName() {
        return gameName;
    }

    public int getPlayers() {
        return players;
    }

    public int getScore() {
        return score;
    }

    public void addPlayer() {
        players++;
    }

    public void increaseScore(int increase) {
        score += increase;
    }

    public double adverageScorePerPlayer() {
        return (double) score / players;
    }

    public boolean isGameOver() {
        return score > 9;
    }

    public void printScores() {
        //got lazy
        System.out.println(getPlayers());
        System.out.println(getScore());
    }
}
