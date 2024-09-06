
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class GUITest {

    public void initGUI() {
        JFrame myFrame = new JFrame();
        Container c = myFrame.getContentPane();

        c.setLayout(new BorderLayout());

        JTextField jtx = new JTextField(10);
        JButton b1 = new JButton("Next Slide");
        JButton b2 = new JButton("Previous Slide");
        JButton b3 = new JButton("Back to Start");
        JButton b4 = new JButton("Last Slide");
        JButton b5 = new JButton("Exit");

        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.EAST);
        c.add(b4, BorderLayout.WEST);
        c.add(b5, BorderLayout.CENTER);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setSize(200, 150);
        myFrame.setVisible(true);
    }

    GUITest() {
        initGUI();
    }

}

public class GUIDemo {

    public static void main(String[] args) {
        GUITest gui = new GUITest();
    }
}
