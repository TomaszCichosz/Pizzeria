import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    @Test
    public void given_Waiter_when_SetMargheritaBuilder_then_ReturnMargheritaPizza() {
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new MargheritaBuilder());

        PizzaBuilder pizzaBuilder = new MargheritaBuilder();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildDough();
        assertEquals(pizzaBuilder.getPizza(), waiter.getPizza());
    }
}
