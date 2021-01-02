public enum Menu {
    SOUP(0, "Суп", 300),
    VEGETABLES(1, "Овощи", 30),
    MEAT(2, "Мясо", 200),
    DESSERT(3, "Десерт", 100);

    private int var;
    private String description;
    private int price;

    Menu(int var, String description, int price) {
        this.description = description;
        this.var = var;
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
        return "Menu{" +
                "var=" + var +
                ", description='" + description + '\'' +
                ", price=" + price + '$' +
                '}';
    }
}
