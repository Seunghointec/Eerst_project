package be.intecbrussel.AutoApp;

public class Auto {
    private String merkNaam;
    private String nummerplaat;
    private Motor motor;


    public Auto(){
        motor = new Motor();
    }

    public Auto(String merkNaam, String nummerplaat) {
        this();
        this.merkNaam = merkNaam;
        this.nummerplaat =nummerplaat;
    }

    public Auto (String merkNaam) {
        this();
        this.merkNaam = merkNaam;
    }

    public Auto(Auto auto) {
        this();
        this.merkNaam = auto.merkNaam;
        this.nummerplaat =auto.nummerplaat;
        this.motor = auto.motor;
    }

    public void geefGas() {
        this.motor.verhoogToerental(200);
    }

    public void geefGas(int toerental) {
        this.motor.verhoogToerental(toerental);
    }

    public void rem() {
        this.motor.setToerental(0);
    }
    public void toonToerental() {
        System.out.println(motor.getToerental());
    }

    public String toString() {
        return merkNaam + " met " + nummerplaat;
    }



}
