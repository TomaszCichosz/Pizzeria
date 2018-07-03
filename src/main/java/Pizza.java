import java.util.Objects;

public class Pizza {

    private String dough;
    private String topping;
    private String sauce;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(dough, pizza.dough) &&
                Objects.equals(topping, pizza.topping) &&
                Objects.equals(sauce, pizza.sauce);
    }

    @Override
    public String toString() {
        return "Dough: " + dough + " Topping: " + topping + " Sauce: " + sauce;
    }
}
