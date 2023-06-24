package Locations;

public class Cabanatuan implements Locations {

    private int airFare = 120;

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