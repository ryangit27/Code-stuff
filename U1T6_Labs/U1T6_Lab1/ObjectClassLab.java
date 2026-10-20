package U1T6_Labs.U1T6_Lab1;
public class ObjectClassLab {
    // Lab 1 of U1T6
    private double age;
    private double weight;
    private String name;
    private int aura;


    public ObjectClassLab(double newAge, double newWeight, String newName, int newAura) {
        age = newAge;
        weight = newWeight;
        name = newName;
        aura = newAura;
    }
    
    public void whoisthis() {
        System.out.println("I am the one and only " + name  + " who is " + age + " years old. I weigh " + weight + " pounds. I have " + aura + " aura");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Aura: " + aura);
    }
}
