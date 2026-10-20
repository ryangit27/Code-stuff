package U1T4_Labs;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InputLab_1 {
    public static void main(String[] args) {
        //Lab: U1T4
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int number = scan.nextInt();
        System.out.println("You entered: " + number);
        System.out.println("in reverse order: " + (number % 10) + ((number / 10) % 10) + (number / 100));
        scan.close();
    }
}