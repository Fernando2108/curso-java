import containers.IContainer;
import orders.IOrder;
import orders.Order;

public class SuperApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienbenido a nuestro supermecado onLine");

        IOrder order1 = new Order("O001");
        System.out.println(order1);

        IContainer box1 = Box(reference:"B007", length:50; width:50; heigt:50);
        IContainer bag = new Bag(reference:"B005", length:50; width:50; heigt:50 );
        oder
    }
}
