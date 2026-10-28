package U1T12_Labs;
// Math Lab UT1L12
public class LuckyNumbers {
  public LuckyNumbers() { 
  }
  public int randomIntegerBetween(int min, int max) {
     return (int)(Math.random()*(max-min+1)+min);
  }

  public String getLuckyNumbers() {
    String luckyNumbers = "Your lucky numbers are";
    for (int i = 0; i < 5; i++) {
      luckyNumbers+=" "+randomIntegerBetween(1, 65);
    }
    String powerball = "Your super ball is " + randomIntegerBetween(1, 30);
    String alltog = luckyNumbers + "\n" + powerball;
    return alltog;
  }
}
