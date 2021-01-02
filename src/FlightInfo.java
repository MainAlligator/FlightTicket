public class FlightInfo {

    private int flightNumber;
    private String departure;
    private String destination;
    private double time;
    private int cost;


    public FlightInfo(int flightNumber, String departure, String destination, double time, int cost) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.time = time;
        this.cost = cost;


    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        return "FlightNumber{" +
                "flightNumber=" + flightNumber +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", time='" + time + '\'' +
                '}';

    }
}
