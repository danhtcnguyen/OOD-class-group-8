import java.util.*;

public class RecordItemHandler {
    private OrderItem oi;
    private Order order;
    
    public void newOrder(Order order) {
        this.order = order;
    }

    public void addItem(String name, int qty) {
        this.oi = new OrderItem(name, qty);
        this.order.pushItem(this.oi);
    }
}
