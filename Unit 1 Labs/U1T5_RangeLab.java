import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class U1T5_RangeLab {
    public static void main(String[] args) {
        //Lab: 
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a amount of money: ");
        double cash = scan.nextDouble();
        double remaining = cash;
        int quarters = (int)(cash/.25);
        remaining = cash%.25;
        int dimes = (int)(remaining/.1);
        remaining = remaining%.1;
        int nickels = (int)(remaining/.05);
        remaining = remaining%.05;
        int pennies = (int)(remaining/.01+.001); //java is cheeks at using %. 5.56 % .25 should be .06 but it led to .05999999 and so on.
        System.out.println("\n\n\n\n\n\n");
        System.out.println("---------------------------------------------");
        System.out.print("you have: $"+cash);
        System.out.println(" which is equal to:");
        System.out.println(quarters +" quarters");
        System.out.println(dimes +" dimes");
        System.out.println(nickels +" nickels");
        System.out.println(pennies +" pennies");
        System.out.println("---------------------------------------------");
        scan.close();
    }
}
