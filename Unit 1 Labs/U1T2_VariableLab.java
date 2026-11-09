/* My name is Ryan Jiang and I like cats
My major is AP CSA*/

public class U1T2_VariableLab {
    public static void main(String[] args) {
    //Lab: U1T2
        final double USD_TO_YEN = 155.17;
        final double CM_TO_FEET = 30.48;
        int OSIS = 238896609;
        String Name = "Ryan";
        String lastName = "Jiang";
        String catName = "Mallow";
        int cats = 1;
        double bankacc = 420.60;
        double height = 170;
        boolean boy;
        boy = true;
        System.out.println("My name is " + Name + " " + lastName);
        System.out.print("I have "+cats+" cat. ");
        System.out.println("his name is" + catName);
        System.out.println("My OSIS is " + OSIS);
        System.out.println("I am "+height/CM_TO_FEET+" feet tall.");
        if (boy == true)
            System.out.println("I am a boy");
        else
            System.out.println("i am a girl");
        System.out.println("I currently have "+bankacc*USD_TO_YEN+" Japanese Yen in my bank account.");
        bankacc = 0;
        System.out.println("Actually I have "+bankacc+" Japenese Yen because I invested in crypto and lost it all");
        System.out.println("BUT, I did grow a few inches");
        height = 180;
        System.out.println("I am now " + height/CM_TO_FEET + " feet tall.");
    }
}
