public class markCompleteHandler {
    public void complete(Order order) {
        activeOrderQueue.popOrder(Order)
        completeOrderQueue.pushOrder(Order) 
    }
 }


public class recordItemHandler {
    public void addItem(String name, int qty) {
        oi = OrderItem(name, qty)
        order.pushItem(oi)
    }
}


public class completeOrderHandler {
    public void record(Order order) {
        takenOrderQueue.pushOrder(order);
    }
}


public class TakenOrderQueue {
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
