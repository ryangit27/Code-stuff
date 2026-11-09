package U1T8_Labs;
// Lab 1
public class Letter {
    // instance variables
    String signatureName = "Ms. Turin";

    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    public Letter(String name) { 
        signatureName = name;
    }
    
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
        signature();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }

    public void signature() {
        System.out.println("Sincerely,");
        System.out.println(signatureName);
    }
}

