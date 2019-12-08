import java.util.*;

public class RecordItemHandler {
    private Order order;
   
    public void newOrder() {
        this.order = new Order();
    }

    public void addItem(String name, int qty) {
        OrderItem oi = new OrderItem(name, qty);
        this.order.pushItem(oi);
    }

    public Order getOrder() {
        return this.order;
    }
}
