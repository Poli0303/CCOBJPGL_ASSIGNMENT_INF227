package Locations;

public class Isabela implements Locations {

    private int airFare = 170;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    public int getAirFare() {
        return airFare;
    }

    public void setAirFare(int airFare) {
        this.airFare = airFare;
    }

}