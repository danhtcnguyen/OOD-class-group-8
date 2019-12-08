import javax.swing.*;

public class FrontMain {
    public static void main() {
        JFrame f = new JFrame();

        JButton b = new JButton("click");
        b.setBound(130,100,100,40);

        f.add(b);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true):
    }
}
