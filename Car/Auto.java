package be.intecbrussel.Car;

public class Auto {
    private String merkNaam;
    private Garage garage;

    public Auto(String merkNaam) {
        this.merkNaam =merkNaam;
    }

    public Auto(Auto auto){
        this.setGarage(garage);
        this.merkNaam= merkNaam;
    }

    public Auto(String merkNaam, Garage garage) {
        setGarage(garage);
        this.merkNaam= merkNaam;
    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public String toString() {
        return merkNaam + garage;
    }
}
