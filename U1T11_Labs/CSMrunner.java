package U1T11_Labs;
 // Lab 3 of U1T11 String Methods
public class CSMrunner {
    public static void main(String[] args) {
        // Runner for the class
        String myCat = "Mallow";
        CustomStringMethods string = new CustomStringMethods();
        boolean boot = string.longerThan("halloween", 8);
        String stri = string.funnyString(myCat, 1);
        String stri2 = string.halvesReversed("hello"); //should return llohe
        String stri3 = string.halvesReversed(stri); //should return lowaaMal
        System.out.println(boot + "\n" + stri + "\n" + stri2 + "\n" + stri3);
        //part 2
        System.out.println("\n");
        String stri4 = string.pigLatin(myCat); //should return allowMay
        String stri5 = string.removeCharacter(myCat, 1); //should return Mllow
        String stri6 = string.insertAt(myCat, "aaaaalll", "l"); //should return Maaaaaallllow
        String stri7 = string.endUp(myCat, 3); //should return MalLOW
        String stri8 = string.yellOrWhisper(myCat); //should return mallow
        String stri9 = string.starBetween(myCat);
        System.out.println(stri4 + "\n" + stri5 + "\n" + stri6 + "\n" + stri7 + "\n" + stri8 + "\n" + stri9);


        // test 2 longer than
        System.out.println("\n\n\n\n\n");

        CustomStringMethods methods = new CustomStringMethods();
        boolean bool = methods.longerThan("apple", 4);
        System.out.println(bool);
        bool = methods.longerThan("apple", 5);
        System.out.println(bool);
        bool = methods.longerThan("apple", 2);
        System.out.println(bool);
        bool = methods.longerThan("apple", 7);
        System.out.println(bool);

        //test 3 funnn stirng
        System.out.println("\n\n\n\n\n");

        String strg = methods.funnyString("computer", 3);
        System.out.println(strg);
        strg = methods.funnyString("computer", 0);
        System.out.println(strg);
        strg = methods.funnyString("computer", 7);
        System.out.println(strg);
        strg = methods.funnyString("apples", 1);
        System.out.println(strg);

        //test 4 reverse
        System.out.println("\n\n\n\n\n");

        String str = methods.halvesReversed("computer");  //even # of letters
        System.out.println(str);
        str = methods.halvesReversed("computers");        //odd # of letters
        System.out.println(str);
        str = methods.halvesReversed("sky");
        System.out.println(str);
        str = methods.halvesReversed("weekend");
        System.out.println(str);
        str = methods.halvesReversed("an");
        System.out.println(str);
        str = methods.halvesReversed("I");
        System.out.println(str);
        str = methods.halvesReversed("see you soon");
        System.out.println(str);
        str = methods.halvesReversed("see you later!");
        System.out.println(str);

        //test 5 pig latin
        System.out.println("\n\n\n\n\n");

        String str2 = methods.pigLatin("computer");
        System.out.println(str2);
        str2 = methods.pigLatin("sky");
        System.out.println(str2);
        str2 = methods.pigLatin("Brooklyn");
        System.out.println(str2);
        str2 = methods.pigLatin("weekend");
        System.out.println(str2);

        //test 6 remove characters
        System.out.println("\n\n\n\n\n");

        String str3 = methods.removeCharacter("Halloween", 5);
        System.out.println(str3);
        str3 = methods.removeCharacter("Halloween", 0);
        System.out.println(str3);
        str3 = methods.removeCharacter("Halloween", 8);
        System.out.println(str3);
        str3 = methods.removeCharacter("Halloween", 9);
        System.out.println(str3);
        str3 = methods.removeCharacter("Halloween", 20);
        System.out.println(str3);
        str3 = methods.removeCharacter("Hi friend", 0);
        System.out.println(str3);
        str3 = methods.removeCharacter("Hi friend", 1);
        System.out.println(str3);
        str3 = methods.removeCharacter("Hi friend", 2);
        System.out.println(str3);
        str3 = methods.removeCharacter(" Hi friend", 0);
        System.out.println(str3);
        str3 = methods.removeCharacter("A", 0);
        System.out.println(str3);
        str3 = methods.removeCharacter("A ", 0);
        System.out.println(str3);
        str3 = methods.removeCharacter("A", 1);
        System.out.println(str3);
        str3 = methods.removeCharacter("A ", 1);
        System.out.println(str3);

        // test 7 insert at
        System.out.println("\n\n\n\n\n");

        String str4 = methods.insertAt("ghost", "BOO!", "o");
        System.out.println(str4);
        str4 = methods.insertAt("ghost", "BOO!", "st");
        System.out.println(str4);
        str4 = methods.insertAt("ghost", "BOO!", "m");
        System.out.println(str4);
        str4 = methods.insertAt("spooooky!", "YIKES", "o");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", "18th", "y");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", "18th", "birthday");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", "18th", " ");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", " 18th", " ");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", "18th ", "bir");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", "18th", "!");
        System.out.println(str4);
        str4 = methods.insertAt("happy birthday!", "18th", "z");
        System.out.println(str4);
        str4 = methods.insertAt("a", "m", "a");
        System.out.println(str4);
        str4 = methods.insertAt("a", "m", "p");
        System.out.println(str4);

        //test 8 end up
        System.out.println("\n\n\n\n\n");

        String str5 = methods.endUp("It's Thursday", 3);
        System.out.println(str5);
        str5 = methods.endUp("hello friend", 3);
        System.out.println(str5);
        str5 = methods.endUp("hello friend!", 3);
        System.out.println(str5);
        str5 = methods.endUp("Shhhh! Be quiet", 3);
        System.out.println(str5);
        str5 = methods.endUp("Yes", 3);
        System.out.println(str5);
        str5 = methods.endUp("Yess", 3);
        System.out.println(str5);
        str5 = methods.endUp("Yesss", 3);
        System.out.println(str5);
        str5 = methods.endUp("no", 3);
        System.out.println(str5);
        str5 = methods.endUp("no!", 3);
        System.out.println(str5);
        str5 = methods.endUp("noo!", 3);
        System.out.println(str5);
        str5 = methods.endUp("noo!!", 3);
        System.out.println(str5);
        str5 = methods.endUp("ALREADY UPPERCASE", 3);
        System.out.println(str5);
        str5 = methods.endUp("hello friend", 1);
        System.out.println(str5);
        str5 = methods.endUp("hello friend", 6);
        System.out.println(str5);
        str5 = methods.endUp("hello friend", 20);
        System.out.println(str5);


        //test 9 yell or whisper
        System.out.println("\n\n\n\n\n");

        String str6 = methods.yellOrWhisper("Hello James!");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("hello James!");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("aBCDEFGHIJK");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("Abcdefghijk");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("B");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("b");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("IT'S SUNNY!");
        System.out.println(str6);
        str6 = methods.yellOrWhisper("it's rainy");
        System.out.println(str6);

        //test 10 star
        System.out.println("\n\n\n\n\n");

        String str7 = methods.starBetween("apple");
        System.out.println(str7);
        str7 = methods.starBetween("Hey what's up?");
        System.out.println(str7);
    }
}