public class recordItemHandler {
    public void addItem(String name, int qty) {
        oi = OrderItem(name, qty)
        order.pushItem(oi)
    }
}


public class completeOrderHandler {
    public completeOrderHandler() {
        takenQueue = new takenOrderQueue();
    }

    public void record(Order order) {
        takenQueue.pushOrder(order);
    }
}


public class TakenOrderQueue {
    public TakenOrderQueue() {
        List<Order> list = new ArrayList<>();
    }

    public void pushOrder(Order order){
        list.add(order);
    }
 
    public void popOrder(Order order){
        return list.remove(order);
    }
}


public class OrderItem {
}


public class Order {
    public void pushItem(OrderItem item){
        list.add(item);
    }
}
