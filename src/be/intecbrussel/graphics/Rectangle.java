package be.intecbrussel.graphics;

public class Rectangle {
    //private encapsulation (buiten wereld klass weet niets)
    //exception setters and getters
    private int x =0;
    private int y =0;
    private int height =0;
    private int width =0;
    private double angle =0;
    private static int count;
    public static final int ANGLES =4;

    //we have initialized a default value of count
    static {
        count=0;
    }

    public Rectangle() {
        //This is a null constructor
    }

    //We have created a new constructor with two parameters
  /*  public Rectangle (int height) {
        setWidth(0);
        setPosition(0,0);
        setAngle(0);
        setHeight(height);
    }

    public Rectangle (int width) {
        this.setHeight(height);
        setWidth(width);
        setPosition(0,0);
        setAngle(0);
    }*/

    //added a constructor with x and y position.
    //counting number of object that are created
    public Rectangle(int height, int width, int xpos, int ypos, int angle) {
        this.setWidth(width);
        this.setHeight(height);
        setPosition(xpos, ypos);
        setAngle(angle);
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
        //double cosinus = Math.cos(angle);
        double xrad;

        for (xrad =0;xrad<2*(Math.PI); xrad+=0.1) {
            xrad = Math.toRadians(angle);
        }
        return xrad;
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
    public void introduceYourRectangle() {
        System.out.println("My rectangle width is " + getWidth() +" and the height is" +getHeight());
        System.out.println("the position of rectangle is at " + getX() + " and " +getY());
        System.out.println("It's has "+getArea() +" for area and " +getPerimeter()+" for perimeter");
    }
}
