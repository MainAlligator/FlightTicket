public class Ticket {

    protected int sitNumber;

    protected FlightInfo flightInfo = new FlightInfo(342, "Cargo", "London", 20, 150);
    protected Passenger passenger = new Passenger("Boris", "Jonson", 323743);


    Ticket(int sitNumber, FlightInfo flightInfo, Passenger passenger) {
        this.sitNumber = sitNumber;
        this.flightInfo = flightInfo;
        this.passenger = passenger;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public int getCost() {
        return flightInfo.getCost();
    }

    public String toString() {
        return "Ticket{" +
                "sitNumber= " + sitNumber +
                ", FlightInfo= " + flightInfo + '\'' +
                ", Passenger= " + passenger + '\'' +
                '}' + ", ticket price= " + getCost() + '$';


    }

}
