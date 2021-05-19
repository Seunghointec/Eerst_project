package be.intecbrussel.graphics;

import static be.intecbrussel.graphics.Rectangle.getCount;

public class CircleApp {

        public static void main(String[] args) {

            int counter;

            Circle circle = new Circle(10,25,35);



            System.out.println("The circle radius is "+ circle.getRadius());
            System.out.println(circle.ANGLES);
            counter= getCount();
            System.out.println(counter);

            circle.introduceYourCircle();
        }
    }

