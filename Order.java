import java.util.*;

public class Order {
	private ArrayList<OrderItem> list;

	public Order() {
		list = new ArrayList<OrderItem>();
	}

    public void pushItem(OrderItem item){
        list.add(item);
    }
}
