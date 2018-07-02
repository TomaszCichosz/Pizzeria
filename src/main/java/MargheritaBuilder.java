public class MargheritaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("thin");
    }

    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    public void buildTopping() {
        pizza.setTopping("none");
    }
}
