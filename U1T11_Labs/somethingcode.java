package U1T11_Labs;

import java.util.Scanner;


public class somethingcode {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       // 1. Ask the user to enter two words
       System.out.print("Enter the first word: ");
       String word1 = scanner.nextLine();
      
       System.out.print("Enter the second word: ");
       String word2 = scanner.nextLine();


       System.out.println(); // Blank line for readability


       // 2. Tell the user which word is longer (or if they are the same length)
       // Uses the length() method
       int len1 = word1.length();
       int len2 = word2.length();


       if (len1 > len2) {
           System.out.println(word1 + " is longer than " + word2 + ".");
       } else if (len2 > len1) {
           System.out.println(word2 + " is longer than " + word1 + ".");
       } else {
           System.out.println("Both words have the same length.");
       }


       // 3. Show each word split into halves (odd-length extra letter goes to second half)
       // Uses both two-parameter and one-parameter substring methods
       int mid1 = len1 / 2;
       String firstHalf1 = word1.substring(0, mid1); // Two-parameter substring
       String secondHalf1 = word1.substring(mid1);   // One-parameter substring
       System.out.println(word1 + " split into halves: \"" + firstHalf1 + "\" and \"" + secondHalf1 + "\"");


       int mid2 = len2 / 2;
       String firstHalf2 = word2.substring(0, mid2);
       String secondHalf2 = word2.substring(mid2);
       System.out.println(word2 + " split into halves: \"" + firstHalf2 + "\" and \"" + secondHalf2 + "\"");


       // 4. Inform the user at what index the second word is found in the first word
       // Uses the indexOf() method
       int index = word1.indexOf(word2);
       if (index != -1) {
           System.out.println(word2 + " is found in " + word1 + " at index " + index);
       } else {
           System.out.println(word2 + " is NOT found in " + word1);
       }


       scanner.close();
   }
}
