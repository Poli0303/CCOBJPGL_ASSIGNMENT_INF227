package Locations;

public class Cavite implements Locations {

    private int airFare = 150;

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