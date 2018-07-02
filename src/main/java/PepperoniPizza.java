public class PepperoniPizza extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("crusty");
    }

    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }
}
