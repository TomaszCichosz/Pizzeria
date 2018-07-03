import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    @Test
    public void given_Waiter_when_SetMargheritaBuilder_then_ReturnMargheritaPizza() {
        Pizza margherita = new Pizza();
        margherita.setTopping("none");
        margherita.setSauce("tomato");
        margherita.setDough("thin");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new MargheritaBuilder());

        assertEquals(margherita, waiter.getPizza());
    }

    @Test
    public void given_Waiter_when_SetHawaiianBuilder_then_ReturnHawaiianPizza() {
        Pizza hawaiian = new Pizza();
        hawaiian.setTopping("pineapple");
        hawaiian.setSauce("tomato");
        hawaiian.setDough("american");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new HawaiianBuilder());

        assertEquals(hawaiian, waiter.getPizza());
    }

    @Test
    public void given_Waiter_when_SetPepperoniBuilder_then_ReturnPepperoniPizza() {
        Pizza pepperoni = new Pizza();
        pepperoni.setTopping("pepperoni");
        pepperoni.setSauce("tomato");
        pepperoni.setDough("crusty");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new PepperoniBuilder());

        assertEquals(pepperoni, waiter.getPizza());
    }
}
