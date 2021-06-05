package be.intecbrussel.graphics;

import static be.intecbrussel.graphics.Rectangle.getCount;

public class RectangleApp {

    public static void main(String[] args) {

        int counter;

        Rectangle rect = new Rectangle(10,5,25,35, 0);
        Rectangle rect1 = new Rectangle(12,6,3,5, 2);
        //created a new object from a constructor
        Rectangle rect2 = new Rectangle(14,7,20,30, 23);
        rect.introduceYourRectangle();
        rect1.introduceYourRectangle();
        rect2.introduceYourRectangle();

        System.out.println(rect.angle(45));
        //did not return the value of x radian.
        System.out.println(Rectangle.ANGLES);
        counter = getCount();
        System.out.println("i have created " + counter + " rectangles");

    }
}
