public class HawaiianBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("american");
    }

    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    public void buildTopping() {
        pizza.setTopping("pineapple");
    }
}
