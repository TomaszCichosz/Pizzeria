import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Margherita: 1");
        System.out.println("Hawaiian: 2");
        System.out.println("Pepperoni: 3");
        int pizzaOrder = scanner.nextInt();
        Waiter waiter = new Waiter();
        switch (pizzaOrder) {
            case 1:
                waiter.setPizzaBuilder(new MargheritaBuilder());
                break;
            case 2:
                waiter.setPizzaBuilder(new HawaiianBuilder());
                break;
            case 3:
                waiter.setPizzaBuilder(new PepperoniPizza());
                break;
        }
        System.out.println(waiter.getPizza());
    }
}
