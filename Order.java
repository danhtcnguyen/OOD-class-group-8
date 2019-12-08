import java.util.*;

public class Order {
	private ArrayList<OrderItem> list;

	public Order() {
		this.list = new ArrayList<OrderItem>();
	}

    public void pushItem(OrderItem item){
        this.list.add(item);
    }
    public String toString() {
        String ret = "";
        for(int i=0; i<this.list.size(); ++i) {
            ret += this.list.get(i).toString();
            ret += '\n';
        }
        return ret;
    }
}
