package be.intecbrussel.graphics;

//what is abstract
public abstract class Shape {

    private int x = 0;
    private int y = 0;
    private static int count;
    //default constructor
    //static will only create once, because it will apply to shape
    // not extend to subclass
    {
        count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setPosition(int x, int y) {
        this.x =x;
        this.y =y;
    }

    //implement the method from the subclass
    public abstract double getArea();

    public abstract int getPerimeter();

    public static int getCount(){
        return count;
    }

}
