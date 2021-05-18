package be.intecbrussel.graphics;

public class Circle {
    //private encapsulation (buiten wereld klass weet niets)
    //exception setters and getters
    private int x =0;
    private int y =0;
    private int radius =0;

    public Circle() {
        //This is a null constructor
        this();
    }

    //We have created a new constructor with two parameters


    //added a constructor with x and y position.
    //counting number of object that are created
    public Rectangle(int height, int width, int xpos, int ypos, int angle) {
        this.setWidth(width);
        this.setHeight(height);
        setPosition(xpos, ypos);
        setAngle();
        count++;
    }

    public void setWidth(int width) {
        //we are implementing ternary operator as an absolute value as a condition
        this.width = width<0?-width:width;
    }

    public void setHeight(int height) {
        this.height = height<0?-height:height;
    }

    public void setAngle(int angle) {
        this.angle = angle<0?-angle:angle;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setPosition(int xpos, int ypos) {
        this.x = xpos>0?-xpos:xpos;
        this.y = ypos>0?-ypos:ypos;
    }

    public double grow(double d) {
        d = 1.1 * d;
        return (d);
    }

    public double angle(double angle) {
        double xrad = Math.toRadians();
        return angle;
    }
    public double getArea() {
        return height*width;
    }

    public double getPerimeter() {
        return 2*(height+width);
    }
    //created a method called count
    public static int getCount () {
        return count;
    }

