import java.util.Scanner;

public class Menu {

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        Waiter waiter = new Waiter();
        int pizzaOrder;
        boolean nextPizza = true;
        while (nextPizza) {
            printMenuInfo();
            pizzaOrder = scanner.nextInt();
            switch (pizzaOrder) {
                case 1:
                    waiter.setPizzaBuilder(new MargheritaBuilder());
                    System.out.println(waiter.getPizza());
                    break;
                case 2:
                    waiter.setPizzaBuilder(new HawaiianBuilder());
                    System.out.println(waiter.getPizza());
                    break;
                case 3:
                    waiter.setPizzaBuilder(new PepperoniBuilder());
                    System.out.println(waiter.getPizza());
                    break;
                case 0:
                    nextPizza = false;
                    break;
            }
        }
    }

    private static void printMenuInfo() {
        System.out.println("Margherita: 1");
        System.out.println("Hawaiian: 2");
        System.out.println("Pepperoni: 3");
        System.out.println("Exit: 0");
    }
}
