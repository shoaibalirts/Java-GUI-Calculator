
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GUITest {

    public void initGUI() {
        JFrame myFrame = new JFrame();
        Container c = myFrame.getContentPane();

        c.setLayout(new BorderLayout());

        JTextField jtx = new JTextField(10);

        JPanel myPanel = new JPanel();
        myPanel.setLayout(new GridLayout(4, 4, 2, 2));
        JButton p7, p8, p9, pMulti, p4, p5, p6, pMinus, p1, p2, p3, pPlus, pPlusMinus, p0, pDot, pEqual;
        JLabel myLabel = new JLabel("My Calculator");

        // creating instance of JButton
        p7 = new JButton("7");
        p8 = new JButton("8");
        p9 = new JButton("9");
        pMulti = new JButton("x");
        p4 = new JButton("4");
        p5 = new JButton("5");
        p6 = new JButton("6");
        pMinus = new JButton("-");
        p1 = new JButton("1");
        p2 = new JButton("2");
        p3 = new JButton("3");
        pPlus = new JButton("+");
        pPlusMinus = new JButton("+/-");
        p0 = new JButton("0");
        pDot = new JButton(".");
        pEqual = new JButton("=");

        myPanel.add(p7);
        myPanel.add(p8);
        myPanel.add(p9);
        myPanel.add(pMulti);
        myPanel.add(p4);
        myPanel.add(p5);
        myPanel.add(p6);
        myPanel.add(pMinus);
        myPanel.add(p1);
        myPanel.add(p2);
        myPanel.add(p3);
        myPanel.add(pPlus);
        myPanel.add(pPlusMinus);
        myPanel.add(p0);
        myPanel.add(pDot);
        myPanel.add(pEqual);

        c.add(jtx, BorderLayout.NORTH);
        c.add(myPanel, BorderLayout.CENTER);
        c.add(myLabel, BorderLayout.SOUTH);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setSize(300, 300);
        myFrame.setVisible(true);
    }

    GUITest() {
        initGUI();
    }

}

public class TestGUICalculator {

    public static void main(String[] args) {
        GUITest gui = new GUITest();
    }
}
