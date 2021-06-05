package be.intecbrussel.graphics;
//since square extend to rectangle that extends to square
public class Square extends Rectangle{
    public final String DESCRIPTION = super.DESCRIPTION + " (Square) ";
    private int side;
    private static int count=0;

    //initialize count to object creation for square
    {
        count++;
    }

    //to recall default constructor
    public Square() {
        this(0, 0, 0);
    }
    //to recall instance variable of rectangle, we use rectangle superclass
    public Square(int side) {
        this(side,0,0);
    }

    public Square(int side, int x, int y) {
        setSide(side);
        setPosition(x,y);
        //super.setWidth(side); import/refer to a rectangle instance variable (uses width and height)
        //super.setHeight(side); import/refer to a rectangle instance variable (uses width and height), but parameter is side
        //super(x,y) to recall superclass instance variable
    }

    public Square(Square side) {
        super(side.getWidth(), side.getHeight(), side.getX(), side.getY(), side.angle);
        //this(Square.getWidth(), side.getHeight(), side.getX(), side.getY(), side.angle);
    }

    //static is not allowed to override
    public static int getCount() {
        return count;
    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {

        super.setHeight(side); //output from super class
        super.setWidth(side); //output from super class
    }

    @Override
    public void setHeight (int height) {setSide(height);}

    @Override
    public void setWidth (int width) {setSide(width);}

    @Override
    public String toString() {
        return "Square{" +
                "DESCRIPTION='" + DESCRIPTION + '\'' +
                ", side=" + side +
                "} " + super.toString();
    }
}
