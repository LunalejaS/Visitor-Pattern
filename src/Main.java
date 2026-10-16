import model.*;
import visitor.*;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.add(new Tablet(), 2);
        order.add(new PC(), 1);
        order.add(new Computer(), 1);
        order.add(new TV(), 1);

        display("Pedido de Wtech", order);
    }

    private static void display(String title, Order order) {
        Visitor subtotal = new CalculateSubtotal();
        order.accept(subtotal);

        Visitor send = new CalculateSend();
        order.accept(send);

        double total = subtotal.getResult() + send.getResult();

        System.out.println("*** " + title + " ***");
        System.out.println("Productos:");
        System.out.print(order.getSummary());
        System.out.println();
        System.out.printf(java.util.Locale.US, "Subtotal: $%.2f%n", subtotal.getResult());
        System.out.printf(java.util.Locale.US, "Envío:    $%.2f%n", send.getResult());
        System.out.printf(java.util.Locale.US, "Total:    $%.2f%n%n", total);
    }
}