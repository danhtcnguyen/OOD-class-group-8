public class SystemDB {
    public void updateStatistics(Order order) {
        // update stats for the given order
    }
}


public class markCompleteHandler {
    public void complete(Order order) {
        activeOrderQueue.popOrder(Order)
        completeOrderQueue.pushOrder(Order) 
    }
 }


public class recordItemHandler {
    public void addItem(string name, int qty) {
        oi = OrderItem(name, qty)
        order.pushItem(oi)
    }
}


public class ProcessHandler {
    public void process(Order order){
        takenOrderQueue.popOrder(order);
        activeOrderQueue.pushOrder(order);
    }
}


public class completeOrderHandler {
    public void record(Order order) {
        takenOrderQueue.pushOrder(order);
    }
}
