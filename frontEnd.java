import java.awt.event.*; 
import javax.swing.*; 

class frontEnd extends JFrame implements ActionListener { 
    // JTextField 
    static JTextField t; 
    static JTextField t3;
    
    //JTextArea
    static JTextArea t2; 
  
    // JFrame 
    static JFrame f; 
  
    // JButton 
    static JButton b; 
    static JButton b2;
  
    // label to display text 
    static JLabel l; 
    static JLabel l2; 
    static JLabel l3;

	// backend objects
	RecordItemHandler addHandler;
	CompleteOrderHandler completeHandler;
  
    // default constructor 
    frontEnd() 
    {
		// setup backend
		addHandler = new RecordItemHandler();
        completeHandler = new CompleteOrderHandler();
		// setup initial order
		addHandler.newOrder();
    } 
  
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame to store text field and button 
        f = new JFrame("textfield"); 
  
        // create a label to display text 
        l = new JLabel("nothing entered"); 
        l2 = new JLabel("Food Name");
        l3 = new JLabel("Quantity");
  
        // create a new button 
        b = new JButton("add"); 
        b2 = new JButton("complete"); 
  
        // create a object of the text class 
        frontEnd te = new frontEnd(); 
  
        // addActionListener to button 
        b.addActionListener(te); 
  
        // create a object of JTextField with 16 columns 
        t = new JTextField(16); 
        t3 = new JTextField(16); 
        t2 = new JTextArea(); 
  
        // create a panel to add buttons and textfield 
        JPanel p = new JPanel(); 
  
        // add buttons and textfield to panel 
        p.add(l2);
        p.add(t); 
        p.add(l3);
        p.add(t3);
        p.add(t2);
        p.add(b); 
        p.add(b2);
        p.add(l);
        
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(300, 300);
  
        f.show(); 
    } 
  
    // if the button is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
    
        if (s.equals("add")) {
			// add the item to the current order
			String name = t.getText();
			int qty = Integer.parseInt(t3.getText());
			addHandler.addItem(name, qty);
			
            // set the text of the label to the text of the field 
            l.setText(t.getText()); 
            
            //t2.setText(t2.getText() + t.getText() + "\n");
            t2.setText(addHandler.getOrder().toString());
            
            // set the text of field to blank 
            t.setText(""); 
            t3.setText("");
        }
		else if (s.equals("complete")) {
			completeHandler.record(addHandler.getOrder());
			addHandler.newOrder();
		}
    } 
}
