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

        assertEquals(margherita.getDough(), waiter.getPizza().getDough());
        assertEquals(margherita.getSauce(), waiter.getPizza().getSauce());
        assertEquals(margherita.getTopping(), waiter.getPizza().getTopping());
    }

    @Test
    public void given_Waiter_when_SetHawaiianBuilder_then_ReturnHawaiianPizza() {
        Pizza hawaiian = new Pizza();
        hawaiian.setTopping("pineapple");
        hawaiian.setSauce("tomato");
        hawaiian.setDough("american");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new HawaiianBuilder());

        assertEquals(hawaiian.getDough(), waiter.getPizza().getDough());
        assertEquals(hawaiian.getTopping(), waiter.getPizza().getTopping());
        assertEquals(hawaiian.getSauce(), waiter.getPizza().getSauce());
    }

    @Test
    public void given_Waiter_when_SetPepperoniBuilder_then_ReturnPepperoniPizza() {
        Pizza pepperoni = new Pizza();
        pepperoni.setTopping("pepperoni");
        pepperoni.setSauce("tomato");
        pepperoni.setDough("crusty");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new PepperoniBuilder());

        assertEquals(pepperoni.getSauce(), waiter.getPizza().getSauce());
        assertEquals(pepperoni.getTopping(), waiter.getPizza().getTopping());
        assertEquals(pepperoni.getDough(), waiter.getPizza().getDough());
    }
}
