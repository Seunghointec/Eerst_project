package be.intecbrussel.graphics;

import static be.intecbrussel.graphics.Rectangle.getCount;

public class CircleApp {

        public static void main(String[] args) {

            Circle circle = new Circle(10,25,35);

            System.out.println("The circle radius is "+ circle.getRadius());
            //we can only use a ClassVariable in the main method
            System.out.println(Circle.ANGLES);
            System.out.println("how many circles were created?");
            //a static method is being recalled i.e. Classname.method()
            System.out.println(Circle.getNumberOfCircleCreated());
            //a non static method is being recalled i.e. objectName.method()
            circle.introduceYourCircle();


        }
    }

