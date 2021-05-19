package be.intecbrussel.graphics;

public class Circle {

        private int x =0;
        private int y =0;
        private int radius =0;
        private static int count;
        public static final int ANGLES =4;

        //we have initialized a default value of count
        static {
            count=0;
        }

        public Circle() {
            //This is a null constructor
        }

        //added a constructor with x and y position.
        //counting number of object that are created
        public Circle(int radius, int xpos, int ypos) {
            this();
            setRadius(radius);
            setPosition(xpos, ypos);
            count++;
        }

        public void setRadius(int radius) {
            //we are implementing ternary operator as an absolute value as a condition
            this.radius = radius<0?-radius:radius;
        }

        public int getRadius() { return radius; }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


        public void setPosition(int xpos, int ypos) {
            this.x = (xpos<0)?-xpos:xpos;
            this.y = (ypos<0)?-ypos:ypos;
        }

        public double grow(double d) {
            d = 1.1 * d;
            return (d);
        }

        public double getArea() {
            return Math.PI*(radius^2);
        }

        public double getPerimeter() {
            return 2*(Math.PI*radius);
        }
        //created a method called count
        public int getCount() {
            return count;
        }

        public void introduceYourCircle() {
            System.out.println("My circle has " + getRadius());
            System.out.println("the position of Circle is at " + getX() + " and " +getY());
            System.out.println("It's has "+getArea() +" for area and " +getPerimeter()+" for perimeter");
        }
    }
