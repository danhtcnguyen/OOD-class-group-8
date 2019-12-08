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
	private String name;
	private int qty;
	public OrderItem(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
}


public class Order {
	private ArrayList<OrderItem> list;
	public Order() {
		list = new ArrayList<OrderItem>();
	}
    public void pushItem(OrderItem item){
        list.add(item);
    }
}
