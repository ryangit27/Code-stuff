public class notfunloop {
  public notfunloop() { }
  // Lab 1 of Unit 2 Lab 4
  public void printDigits(int number) {
    int num = number;
    while (num != 0) {
      System.out.println(num%10);
      num/=10;
    }
  }

  public int countLetter(String word, String letter) {
    int temp = 0;
    int count = 0;
    while (temp < word.length()) {
      if (word.substring(temp,temp+1).equals(letter)) {
        count++;
      }
      temp++;
    }
    return count;
  }

  public int maxDoubles(int number, int threshold) {
    int num = number;
    int count = 0;
    while (num*2 <= threshold) {
      count++;
      num*=2;
    }
    return count;
  }

  public boolean isPrime(int number) {
    int num = number;
    if (num == 1) {
      return false;
    }

    num = 2;
    while (num<number) {
      if (number%num == 0) {
        return false;
      }
      num ++;
    }
    return true;
  }
}
