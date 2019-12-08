SystemDB:
    public void updateStatistics(Order order) {
        // update stats for the given order
    }


markCompleteHandler:
    public void complete(Order order) {
        activeOrderQueue.popOrder(Order)
        completeOrderQueue.pushOrder(Order) 
    }


recordItemHandler:
    public void addItem(string name, int qty) {
        oi = OrderItem(name, qty)
        order.pushItem(oi)
    }


ProcessHandler:
    public void process(Order order){
        takenOrderQueue.popOrder(order);
        activeOrderQueue.pushOrder(order);
    }


completeOrderHandler:
    public void record(Order order) {
        takenOrderQueue.pushOrder(order);
    }
