package be.intecbrussel.graphics;

import static be.intecbrussel.graphics.Rectangle.getCount;

public class RectangleApp {

    public static void main(String[] args) {

        int counter;

        Rectangle rect = new Rectangle(10,5,25,35, 0);
        Rectangle rect1 = new Rectangle(12,6,3,5, 2);
        //created a new object from a constructor
        Rectangle rect2 = new Rectangle(14,7,20,30, 23);

        System.out.println("The rectangle width is "+ rect.getWidth()+ " and the height is " + rect.getHeight());
        System.out.println("The rectangle 1 width is "+ rect1.getWidth()+ " and the height is " + rect1.getHeight());
        System.out.println("the rectangle is" + rect2);
        System.out.println(Rectangle.ANGLES);
        counter = getCount();
        System.out.println(counter);
    }
}
