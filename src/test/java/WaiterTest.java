import org.junit.Test;
import constants.Constants;

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

        assertEquals(Constants.MARGHERITADOUGH, waiter.getPizza().getDough());
        assertEquals(Constants.MARGHERITASAUCE, waiter.getPizza().getSauce());
        assertEquals(Constants.MARGHERITATOPPING, waiter.getPizza().getTopping());
    }

    @Test
    public void given_Waiter_when_SetHawaiianBuilder_then_ReturnHawaiianPizza() {
        Pizza hawaiian = new Pizza();
        hawaiian.setTopping("pineapple");
        hawaiian.setSauce("tomato");
        hawaiian.setDough("american");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new HawaiianBuilder());

        assertEquals(Constants.HAWAIIANDOUGH, waiter.getPizza().getDough());
        assertEquals(Constants.HAWAIIANTOPPING, waiter.getPizza().getTopping());
        assertEquals(Constants.HAWAIIANSAUCE, waiter.getPizza().getSauce());
    }

    @Test
    public void given_Waiter_when_SetPepperoniBuilder_then_ReturnPepperoniPizza() {
        Pizza pepperoni = new Pizza();
        pepperoni.setTopping("pepperoni");
        pepperoni.setSauce("tomato");
        pepperoni.setDough("crusty");
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new PepperoniBuilder());

        assertEquals(Constants.PEPPERONISAUCE, waiter.getPizza().getSauce());
        assertEquals(Constants.PEPPERONITOPPING, waiter.getPizza().getTopping());
        assertEquals(Constants.PEPPERONIDOUGH, waiter.getPizza().getDough());
    }
}
