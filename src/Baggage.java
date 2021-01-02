public class Baggage {

    private int amount;
    private int customsFee;

    public Baggage(int amount, int customsFee) {
        this.amount = amount;
        this.customsFee = customsFee;
    }

    public int getFee() {
        return customsFee * amount;
    }

    public String toString() {
        return "Baggage{" +
                "amount=" + amount +
                ", fee=" + getFee() + '$' +
                '}';
    }
}
