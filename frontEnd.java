import java.awt.event.*;
import javax.swing.*;
class FrontEnd extends JFrame implements ActionListener {
    // JTextField
    static JTextField text;
    static JTextField text3;

    //JTextArea
    static JTextArea text2;
    static JTextArea summary;

    // JFrame
    static JFrame frameObject;

    // JButton
    static JButton button;
    static JButton button2;

    // Label to display text
    static JLabel label;
    static JLabel label2;
    static JLabel label3;

    // Backend objects
    RecordItemHandler addHandler;
    CompleteOrderHandler completeHandler;

    // Default constructor
    FrontEnd() {
        // setup backend
        addHandler = new RecordItemHandler();
        completeHandler = new CompleteOrderHandler();

        // setup initial order
        addHandler.newOrder();
    }

    // main class
    public static void main(String[] args) {
        // create a new frame to store text field and button
        frameObject = new JFrame("textfield");

        // create a label to display text
        label = new JLabel("nothing entered");
        label2 = new JLabel("Food Name");
        label3 = new JLabel("Quantity");

        // create a new button
        button = new JButton("add");
        button2 = new JButton("complete");

        // create a object of the text class
        FrontEnd front = new FrontEnd();

        // addActionListener to button
        button.addActionListener(front);
        button2.addActionListener(front);

        // create a object of JTextField with 16 columns
        text = new JTextField(16);
        text3 = new JTextField(16);
        text2 = new JTextArea();
        summary = new JTextArea();

        // create a panel to add buttons and textfield
        JPanel buttonPanel = new JPanel();

        // add buttons and textfield to panel
        buttonPanel.add(label2);
        buttonPanel.add(text);
        buttonPanel.add(label3);
        buttonPanel.add(text3);
        buttonPanel.add(text2);
        buttonPanel.add(summary);
        buttonPanel.add(button);
        buttonPanel.add(button2);
        buttonPanel.add(label);

        // add panel to frame
        frameObject.add(buttonPanel);

        // set the size of frame
        frameObject.setSize(300, 300);

        frameObject.show();
    }

    // if the button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String action = e.getActionCommand();
        System.out.println(action);

        if (action.equals("add")) {
            // add the item to the current order
            String name = text.getText();
            int qty = Integer.parseInt(text3.getText());
            addHandler.addItem(name, qty);

            // set the text of the label to the text of the field
            label.setText(text.getText());

            //t2.setText(t2.getText() + t.getText() + "\n");
            text2.setText(addHandler.getOrder().toString());

            // set the text of field to blank
            text.setText("");
            text3.setText("");
        }
        if (action.equals("complete")) {
            completeHandler.record(addHandler.getOrder());
            addHandler.newOrder();
            summary.setText(completeHandler.strQueue());
            System.out.println("complete");
        }
    }
}
