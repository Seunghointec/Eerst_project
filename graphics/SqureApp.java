package be.intecbrussel.graphics;

public class SqureApp {
    public static void main(String[] args) {
        //creation of default constructor
        Square square = new Square();
        //creation of parameter constructor
        Square square1 =new Square(12, 2,4);
        //creation of copy constructor
        Square square2 = new Square(square1);

        System.out.println(square2.toString());

        Rectangle rect = new Square();
        square.setPosition(3,5);
        square.setSide(-5);
        System.out.println(square.DESCRIPTION); //output Rectangle (square)
        System.out.println(rect.DESCRIPTION); //output Rectangle
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println("Our rectangle is" +square.getSide());
        //to count number of superclass object creation
        System.out.println(Square.getCount());
    }
}
