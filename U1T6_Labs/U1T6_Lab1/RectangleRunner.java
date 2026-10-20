package U1T6_Labs.U1T6_Lab1;
public class RectangleRunner {
   public static void main(String[] args) {

       // creating one instance/object from the Rectangle class
       Rectangle rect1 = new Rectangle(5, 6);
       rect1.printParameter();  // calling a method on the object

       // creating ANOTHER instance/object from the Rectangle class
       Rectangle rect2 = new Rectangle(10,8);
       rect2.printParameter();  // calling a method on the object

       Rectangle rect3 = new Rectangle(15, 20);
       rect3.printParameter();  // calling a method on the object
   }
}



