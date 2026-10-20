import java.math.RoundingMode;
import java.text.DecimalFormat;

public class U1T3_MathLab {
    public static void main(String[] args) {
        //Lab: U1T3
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        double applec = 0.6;
        double pineaplec = 3.59;
        double ricepbc = 1.39;
        String name = "Stacey";
        int itemsPurchased = 13;
        double spent = applec*3+pineaplec*5+ricepbc*5;
        double avg = spent/itemsPurchased;
        double moneyGiven = 40.0;
        double change = moneyGiven-spent;
        System.out.println("----------------------------");
        System.out.println("Customer: "+name);
        System.out.println("Num of items: "+itemsPurchased);
        System.out.println("cost"+spent);
        System.out.println("avg cost: "+df.format(avg));
        System.out.println();
        System.out.println("Money tendered: "+moneyGiven);
        System.out.println("Change: "+df.format(change));
        System.out.println("----------------------------");
    }
}
