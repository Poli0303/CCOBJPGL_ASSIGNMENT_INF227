package Locations;

public class Tagaytay implements Locations {

    private int airFare = 80;

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