import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "null";
        int n;
        RecordItemHandler addHandler = new RecordItemHandler();
        CompleteOrderHandler completeHandler = new CompleteOrderHandler();
        int cont;

        while (true) {
            addHandler.newOrder();

            while (true) {
                s = in.nextLine();
                n = in.nextInt();

                if (n==0) break;

                addHandler.addItem(s,n);
                System.out.println("Added item " + s + " at quantity " + n);

                s = in.nextLine();
            }
            System.out.println("Finished adding items");
            completeHandler.record(addHandler.getOrder());

            System.out.println("Added order to queue");
            System.out.println(Arrays.toString(completeHandler.getQueue().toArray()));

            System.out.println("Enter 1 to create another order, or 0 to exit");
            cont = in.nextInt();
            if (cont == 0) break;
            s = in.nextLine();
        }
    }
}
