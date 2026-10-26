package U1T11_Labs;

import java.util.Scanner;

public class StringMethods2 {
    //Lab: U1T11 Lab 2 - String Methods
    public static void main(String[] args) {
        //equal or not equal
        Scanner thisisascanner = new Scanner(System.in);

        System.out.print("enter num 1: ");
        String num1 = thisisascanner.nextLine();
        System.out.print("enter num 2: ");
        String num2 = thisisascanner.nextLine();

        if (num1.equals(num2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not");
            if (num1.compareTo(num2) > 0) {
                System.out.println(num2 + " comes before " + num1 + " in the alphabetical order");
            } else {
                System.out.println(num1 + " comes before " + num2 + " in the alphabetical order");
            }
        }
    }
}