import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class _base {
    public static void main(String[] args) {
        //Lab: 
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        Scanner scan = new Scanner(System.in);
        scan.close();
    }
}
