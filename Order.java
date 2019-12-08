import java.util.*;

public class Order {
	private ArrayList<OrderItem> list;

	public Order() {
		this.list = new ArrayList<OrderItem>();
	}

    public void pushItem(OrderItem item){
        this.list.add(item);
    }
}
