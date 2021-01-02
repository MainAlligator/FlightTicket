import java.util.Arrays;

public enum Drinks {
    NO(0, " ", 0),
    YES(0, "Whisky", 50);

    private int var;
    private String description;
    private int price;


    private Drinks(int var, String description, int price) {

        this.var = var;
        this.description = description;
        this.price = price;
    }

    public int getVar() {
        return var;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Drinks{" +
                "var=" + var +
                ", description='" + description + '\'' +
                ", price=" + price + '$' +
                '}';

    }

}
