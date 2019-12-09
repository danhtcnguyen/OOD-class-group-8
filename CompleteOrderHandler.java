import java.util.*;

public class CompleteOrderHandler {
    private TakenOrderQueue takenQueue;

    public CompleteOrderHandler() {
        this.takenQueue = new TakenOrderQueue();
    }

    public void record(Order order) {
        this.takenQueue.pushOrder(order);
    }

    public String strQueue() {
        ArrayList<Order> queue = this.takenQueue.getQueue();
        String ret = "";

        for (int i=0; i<queue.size(); ++i) {
            ret += "Order " + (i+1) + "\n";
            ret += queue.get(i).toString();
            ret += "\n";
        }
        return ret;
    }
}
