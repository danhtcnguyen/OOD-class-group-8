import javax.swing.*;

public class FrontMain {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JButton b = new JButton("click");
        b.setBounds(10,10,100,40);

        f.add(b);

        f.setSize(40,50);
        f.setLayout(null);
        f.setVisible(true);
    }
}
