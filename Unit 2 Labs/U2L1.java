import java.util.Scanner;

public class U2L1 {
   // Lab 1 of Unit 2. If statements
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Magic 8 Ball!");
      System.out.print("Enter a yes-no question and I will answer it: ");
      String question = scan.nextLine();

      int choice = (int) (Math.random() * 6);
      String answer = "";

      if (choice == 0) {
         answer = "Without a doubt!";
      } else if (choice == 1) {
         answer = "My sources say no.";
      } else if (choice == 2) {
         answer = "Yes - definitely.";
      } else if (choice == 3) {
         answer = "Outlook not so good.";
      } else if (choice == 4) {
         answer = "Reply hazy, try again.";
      } else {
         answer = "Signs point to yes.";
      }

      System.out.println("Magic 8 Ball says: " + answer);
   }
}