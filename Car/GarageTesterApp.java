package be.intecbrussel.Car;

public class GarageTesterApp {
    public static void main(String[] args) {
        //Declared a new garage
        Garage garage = new Garage("Verstraeten NV");
        //declared a new car
        Auto auto = new Auto("BMW z24 ");
        System.out.println("Auto: "+auto.toString() +" Garage: " +garage.toString());
       //try to use 3rd constructor(a clone)
        Garage garage1 =new Garage("Mercedes garage");
        Auto auto1 = new Auto(auto);
        System.out.println("Auto: "+auto1.toString());
    }
}
