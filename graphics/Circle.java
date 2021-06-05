package be.intecbrussel.graphics;

public class Circle {


        private int radius =0;
        public static final int ANGLES;
        private static int numberOfCircleCreated =0;

    //we have initialized a default value of count
    static {
        ANGLES = 4;
    }

        public Circle() {
            //This is a null constructor
        }

        //added a constructor with x and y position.
        //counting number of object that are created
        public Circle(int radius, int xpos, int ypos) {
            this();
            setRadius(radius);
            numberOfCircleCreated++;
        }

        public void setRadius(int radius) {
            //we are implementing ternary operator as an absolute value as a condition
            this.radius = radius<0?-radius:radius;
        }

        public int getRadius() { return radius; }

        public int getX() {
            return getY();
        }

        public int getY() {
            return getY();
        }



            //x and y ClassVariable were used
            //this was used to refer/allow private ClassVariable
            //this method will override from Shape


        public double grow(double d) {
            return (1.1 * d);
        }

        public double getArea() {
            return Math.PI*(radius^2);
        }

        public double getPerimeter() {
            return 2*(Math.PI*radius);
        }


        public void introduceYourCircle() {
            System.out.println("My circle has " + getRadius());
            System.out.println("the position of Circle is at " + getX() + " and " +getY());
            System.out.println("It's has "+getArea() +" for area and " +getPerimeter()+" for perimeter");
            System.out.println("My circle has grown to " +grow(7));
        }

        public static int getNumberOfCircleCreated() {
        return numberOfCircleCreated;
        }
    }
