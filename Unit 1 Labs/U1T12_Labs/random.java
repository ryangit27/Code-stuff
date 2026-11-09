package U1T12_Labs;
// Math Lab UT1L12
public class random {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int randomNum = (int)(Math.random() * 36 + 50);
            if (randomNum <= 50) {
                System.out.println(randomNum);
            } else if (randomNum >= 85) {
                System.out.println(randomNum);
            }
        }
        // new
        System.out.println("\n\n\n\n\n\n\n");
        LuckyNumbers hello = new LuckyNumbers();
        System.out.println(hello.randomIntegerBetween(1, 65));
        System.out.println(hello.getLuckyNumbers());
    }
}
