package U1T11_Labs;
import java.util.Scanner;

public class wordgame {
    // Lab 2 - Word Game
    public static void main(String[] args) {
        System.out.println("welcome to tgshisdsfdgsdgsdgsdgdsgds amazing word game");
        int score = 0;
        Scanner mal = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String player1 = mal.nextLine();
        int current = 1;
        System.out.println("Please enter word " + current + ": ");
        String tsword = mal.nextLine();
        String nextwrd = tsword;
        current++;
        int len1;

        while (score < 50) {
            System.out.println(player1 + ", your current score is: " + score);
            tsword = nextwrd;
            System.out.println("Please enter word " + current + ": ");
            nextwrd = mal.nextLine();
            current++;
            if (tsword.compareTo(nextwrd) < 0) {
                System.out.println(nextwrd + " comes after " + tsword + " in an alphabetical order! (+2 points)");
                score+=2;
            } else if (tsword.compareTo(nextwrd) > 0) {
                System.out.println(tsword + " comes after " + nextwrd + " in an alphabetical order. (-5 point)");
                score-=5;
            } else {
                System.out.println("The words are the same :( (-10 points)");
                score-=10;
            }

            len1 = tsword.length();
            if (len1-2 < 0) {
                len1 = 0;
            } else {
                len1 -= 2;
            }

            if (tsword.substring(len1).equals(nextwrd.substring(0,1))){
                System.out.println("The last two letters of " + tsword + " are the same as the first two letters of " + nextwrd + "! (+5 points)");
                score+=5;
            } else {
                System.out.println("The last two letters of " + tsword + " are not the same as the first two letters of " + nextwrd + ". (0 points)");
            }

            if (nextwrd.indexOf(tsword.substring(0,1)) != -1) {
                System.out.println("The first letter of " + tsword + " is in " + nextwrd + "! (+3 points)");
                score+=3;
            } else {
                System.out.println("The first letter of " + tsword + " is not in " + nextwrd + ". (0 points)");
            }
        }
    }    
}
