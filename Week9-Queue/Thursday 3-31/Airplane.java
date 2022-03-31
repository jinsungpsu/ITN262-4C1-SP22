public class Airplane {
    private String airline;
    private int flight;

    public Airplane(String airline, int flight) {
        this.airline = airline;
        this.flight = flight;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "airline='" + airline + '\'' +
                ", flight=" + flight +
                '}';
    }
}
