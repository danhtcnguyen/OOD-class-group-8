import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "null";
        int n;
        RecordItemHandler addHandler = new RecordItemHandler();
        CompleteOrderHandler completeHandler = new CompleteOrderHandler();

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
    }
}
