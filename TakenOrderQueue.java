import java.util.*;

public class TakenOrderQueue {
    private ArrayList<Order> list;

    public TakenOrderQueue() {
        this.list = new ArrayList<>();
    }

    public void pushOrder(Order order){
        this.list.add(order);
    }
 
    public void popOrder(Order order){
        this.list.remove(order);
    }

    public ArrayList<Order> getQueue() {
        return this.list;
    }
}
