import java.util.Scanner;

public class Lab2 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number that is either positive, even, and a multiple of 7 OR prime:");
       int userNum = scanner.nextInt();


       while ((userNum <= 0 || userNum % 2 != 0 || userNum % 7 != 0) && !isPrime(userNum)) {
           if (userNum <= 0) {
               System.out.println("not positive");
           }
           if (userNum % 2 != 0) {
               System.out.println("not even");
           }
           if (userNum % 7 != 0) {
               System.out.println("not a multiple of 7");
           }
           System.out.print("do it again: ");
           userNum = scanner.nextInt();
       }
       if (isPrime(userNum)) {
           System.out.println("good, " + userNum + " is prime!");
       } else {
           System.out.println("good " + userNum + " is a positive, even, multiple of 7!");
       }
   }
   private static boolean isPrime(int number) {
       if (number <= 1) {
           return false;
       }
       int divs = 2; 
       while (divs < number) {
           if (number % divs == 0) {
               return false;  
           }
           divs++;
       }
       return true;
   }


}
