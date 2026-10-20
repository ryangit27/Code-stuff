public class CatRunner {
    public static void main(String[] args) {
        // creating one instance/object from the Cat class
        Cat cat1 = new Cat("Mallow", 1, 7);
        cat1.introduce();  // calling a method on the object
        cat1.printCatInfo();  // calling a method on the object
        System.out.println();
        // creating ANOTHER instance/object from the Cat class
        Cat cat2 = new Cat("Siddharth Rajput", 16, 150);
        cat2.printCatInfo(); 
        cat2.introduce();
    }
}
