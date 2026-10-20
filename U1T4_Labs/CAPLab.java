package U1T4_Labs;
import java.util.Scanner;

public class CAPLab {
    public static void main(String[] args) {
        //Lab: U1T4 Part 2
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "! "+"How are you? Welcome to my program. ");
        System.out.print(name+", tell me your age: ");
        int age = scan.nextInt();
        int oldage = age;
        System.out.print("what is your favorite number? ");
        int favNum = scan.nextInt();
        System.out.println(name + ", you are " + age + " years old and your favorite number is " + favNum + ".");
        age -= 2;
        System.out.println("2 years ago, you were " + age + " years old.");
        age --;
        System.out.println("The year before, you were " + age + " years old.");
        favNum *= 2;
        System.out.println("Twice your favorite number is " + favNum + ".");
        favNum /= 2;
        System.out.println("Half your favorite number is " + favNum + ".");
        favNum %= 2;
        if (favNum == 0) {
            System.out.println("Your favorite number is even.");
        } else {
            System.out.println("Your favorite number is odd.");
        }
        if (oldage >= 18) {
            System.out.println("Wow unc you are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
        int ba = 0;
        while (oldage < 18) {
            oldage ++;
            ba += 1;
        }
        if (ba == 0) {
            System.out.println();
        } else if (ba > 10) {
            System.out.print("youngling, you needa wait " + ba + " years to be an adult.");
        } else 
            System.out.println("in " + ba + " years, you will be an adult.");
        scan.close();
    }
}
