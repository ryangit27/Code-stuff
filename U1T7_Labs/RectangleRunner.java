package U1T7_Labs;
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(15, 25);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();
        rect3.setLength(140);
        rect3.setWidth(100);

        System.out.println("The area of plot1 is: " + rect1.calculateArea());
        System.out.println("The area of plot2 is: " + rect2.calculateArea());
        System.out.println("The area of plot3 is: " + rect3.calculateArea());
        System.out.println("totaling to: " + (rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea()));
        System.out.println("The 3 plots require a total of " + (rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea()) * 0.5 + " square feet of seed.");
    }
}
