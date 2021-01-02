public class Meal {
    Menu menu;
    Drinks drinks;


    public Meal(Menu menu, Drinks drinks) {
        this.menu = menu;
        this.drinks = drinks;
    }

    public Menu getMenu() {
        return menu;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public int getPrice() {
        return menu.getPrice() + drinks.getPrice();
    }

    public String toString() {
        return "Meal{" +
                "Menu=" + menu +
                ", Drinks='" + drinks + '\'' +
                ", price=" + getPrice() + '$' +
                '}';
    }
}
