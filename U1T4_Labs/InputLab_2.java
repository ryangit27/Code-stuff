package U1T4_Labs;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InputLab_2 {
    public static void main(String[] args) {
        //Lab: U1T4
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        Scanner scan = new Scanner(System.in);
        Boolean notDone = true;
        System.out.print("Player 1, please enter your name: ");
        String name1 = scan.nextLine();
        System.out.print("Player 2, please enter your name: ");
        String name2 = scan.nextLine();
        System.out.print(name1 + ", please enter a number: ");
        double number1 = scan.nextDouble();
        System.out.print(name2 + ", please enter a number: ");
        double number2 = scan.nextDouble();
        if (number1 > number2) {
                System.out.println(name1 + " has the larger number.");
            } else if (number1 < number2) {
                System.out.println(name2 + " has the larger number.");
            } else {
                notDone = false;
            }
        while (notDone) {
            System.out.print("You're previous numbers were " + number1 + " and " + number2 + ". ");
            System.out.print(name1 + ", please enter another number: ");
            number1 = scan.nextDouble();
            System.out.print(name2 + ", please enter another number: ");
            number2 = scan.nextDouble();
            if (number1 > number2) {
                System.out.println(name1 + " has the larger number.");
            } else if (number1 < number2) {
                System.out.println(name2 + " has the larger number.");
            } else {
                notDone = false;
            }
        }
        System.out.println("The numbers are equal. you win! Thanks for playing.");
        scan.close();
    }
}