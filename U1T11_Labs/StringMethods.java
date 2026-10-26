package U1T11_Labs;

public class StringMethods {
    //Lab: U1T11 Lab 1 - String Methods
    public static void main(String[] args) {
        String str1a = "Hello!";  System.out.println(str1a.length());

        String str2a = " H e l l o ! ";
        int len = str2a.length();
        System.out.println(len);

        String str3a = "Is tax 8.5%?";
        System.out.println(str3a.length());

        String str4a = "43";
        int len2 = str4a.length();
        System.out.println(len2);

        String str5a = "";
        System.out.println(str5a.length());

        String str6a = "Cat says \"MEOW\"!";
        System.out.println(str6a.length());

        String str7a = "\\\"\"\n\\\n";
        System.out.println(str7a.length());

        //Next part
        System.out.println("\f");

        String hello = "Hello";
        String october = "it's October 5!";
        int totalLength = hello.length() + october.length();
        System.out.println(totalLength);

        //Next part
        System.out.println("\f");
        String str1b = "Hello how are you today?";
        String str2b = "you";
        String str3b = "You";
        System.out.println(str1b.indexOf(str2b));
        System.out.println(str1b.indexOf(str3b));

        //Next part
        System.out.println("\f");

        String myString = "I love October!";
        String oct = myString.substring(7,11);
        System.out.println(oct);
        String str2 = myString.substring(0,myString.length());
        System.out.println(str2);
    }
}
