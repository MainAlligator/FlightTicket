public class VipTicket extends Ticket {
    private Baggage baggage = new Baggage(2, 40);
    private Meal meal = new Meal(Menu.DESSERT, Drinks.NO);


    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;
    }

    @Override
    public int getCost() {
        return flightInfo.getCost() + baggage.getFee() + meal.getPrice();
    }

    public String toString() {
        return "Ticket{" +
                "sitNumber=" + sitNumber +
                ", meal =  " + meal + '\'' +
                ", baggage= " + baggage + '\'' +
                '}' + ", ticket price= " + getCost() + '$' +
                '}';

    }

} //{sitNumber=2, meal=Meal{menu=Menu{var=3, description='Десерт', price=100$}, drinks=Drinks{var=0, description='С напитками', price=50$}, total price=150$}, baggage=Baggage{ amount=2, fee=40 $ }, ticket price=1190 $ }
