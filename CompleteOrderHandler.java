import java.util.*;

public class CompleteOrderHandler {
    private TakenOrderQueue takenQueue;

    public CompleteOrderHandler() {
        TakenOrderQueue takenQueue = new TakenOrderQueue();
    }

    public void record(Order order) {
        this.takenQueue.pushOrder(order);
    }
}
