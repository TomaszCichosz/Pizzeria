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
    public String toString() {
        return "Dough: " + dough + " Topping: " + topping + " Sauce: " + sauce;
    }
}
