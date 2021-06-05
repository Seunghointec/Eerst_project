package be.intecbrussel.graphics;

public class Rectangle extends Shape {
    //private encapsulation (buiten wereld klass weet niets)
    //exception setters and getters

    private int height =0;
    private int width =0;
    public int angle =0;
    private static int count;
    public static final int ANGLES =4;
    public final String DESCRIPTION = "Rectangle";


    //static are used to to encapsulated variable or method
    //so it won't be accessible to other method unless the method create an instance object
    //we have initialized a default value of count
    static {
        count=0;
    }

    public Rectangle() {
        //This is a null constructor
    }


    //added a constructor with x and y position.
    //counting number of object that are created
    public Rectangle(int height, int width, int xpos, int ypos, int angle) {
        this();
        this.setWidth(width);
        this.setHeight(height);
        setPosition(xpos, ypos);
        setAngle(angle);
        count++;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.width, rectangle.height, rectangle.getX(), rectangle.getY(), rectangle.angle);
    }

    public void setWidth(int width) {
        //we are implementing ternary operator as an absolute value as a condition
        this.width = width<0?-width:width;
    }

    public void setHeight(int height) {
        this.height = height<0?-height:height;
    }

    public void setAngle(int angle) { this.angle = angle<0 ? -angle : angle;
    }

    public int getX() {
        return getY();
    }

    public int getY() {
        return getY();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double grow(double d) {
        d = 1.1 * d;
        return (d);
    }

    public double angle(double angle) {
        return Math.toRadians(angle);
    }

    public double getArea() {
        return height*width;
    }

    public int getPerimeter() {
        return 2*(height+width);
    }
    //created a method called count
    public static int getCount () {
        return count;
    }

    public void introduceYourRectangle() {
        System.out.println("My rectangle width is " + getWidth() +" and the height is " +getHeight());
        System.out.println("The position of rectangle is at " + getX() + " and " +getY());
        System.out.println("It's has "+getArea() +" for area and " +getPerimeter()+" for perimeter");
        System.out.println("My rectangle has grown to " +grow(7));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", height=" + height +
                ", width=" + width +
                ", angle=" + angle +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                '}';
    }
}
