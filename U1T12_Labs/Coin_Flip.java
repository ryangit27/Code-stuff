package U1T12_Labs;
// Math Lab UT1L12
public class Coin_Flip {
    private int heads;
    private int tails;
    private int error;
    public Coin_Flip() {
    }
    
    public String Flip() {
        int call = (int) (Math.random()*2+1);
        if ( call == 1 ) {
            return "tails";
        } else if (call == 2) {
            return "heads";
        } else 
            return "error";
    }

    public double Simulate (int flips) {
        for (int i=0;i<flips;i++) {
            String call2 = Flip();
            if (call2 == "heads") {
                heads++;
            } else if (call2 == "tails") {
                tails++;
            } else
                error++;
        }
        double calc = 100*(double)heads/flips;
        double calc2 = 100*(double)tails/flips;
        double calc3 = 100*(double)error/flips;
        String finalcalc = "heads percentage: " + calc + "%\ntails percentage: " + calc2 + "%\nerrors: " + error + " and the percentage: " + calc3 + "%";
        System.out.println(finalcalc+"\n");
        return calc;
    }
}
