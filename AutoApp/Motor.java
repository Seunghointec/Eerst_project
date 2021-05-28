package be.intecbrussel.AutoApp;

public class Motor {
    private final int MAX_TOERENTAL =5800;
    public  int toerental =0;

    public Motor() {
        //null constructor
    }


    public int getToerental() {
        return toerental;
    }

    public void setToerental(int toerental) {
        this.toerental = toerental;
    }

    public void verhoogToerental(int toerental) {
        this.toerental += toerental;
        if (this.toerental > MAX_TOERENTAL) {
            this.toerental = MAX_TOERENTAL;
        }
    }

}