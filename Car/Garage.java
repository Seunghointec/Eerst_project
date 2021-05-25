package be.intecbrussel.Car;

public class Garage {
    private String naam;

    public Garage() {
       //null constructor
    }

    public Garage (String naam) {
        setNaam(naam);
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return naam;
    }
}
