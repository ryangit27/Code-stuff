package U1T10_Labs;


public class U1T10 {
    public static void main(String[] args) {
        String str1 = "Wednesday";
        String str2 = new String("October"); //purpose?
        System.out.println(str1.length());
        System.out.println(str2);

        System.out.println("Cows say \"Moo\"!");
        System.out.println("Brooklyn Tech\n29 Ft. Greene\nBrooklyn");
        System.out.println("The string \"\"\nis an empty string.");
        System.out.println("The escape sequence for \\ is \\\\");
        System.out.println("The escape sequence for \" is \\\"");
        System.out.println("My favorite punctuation mark is \"\\\"");
        System.out.println(" Now I know my \nA \n B \n  C's");
        System.out.println("Dear Jen, \nSincerely,\nThe teacher");
        System.out.println("/A\\V/A\\\n\\V/A\\V/");
        System.out.println("  /\\\n /\"\"\\\n/\"  \"\\\n\\\"  \"/\n \\\"\"/\n  \\/");

        // Runner for baby parrot

        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);

        //Runner for Student

        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        System.out.println(student.getStudentInfo());
    }
}
