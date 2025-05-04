package zd_java_swing.b_swing_layout_managers;

import java.awt.*;
import javax.swing.*;

public class c_gridlayout {
    JFrame frame;

    c_gridlayout() {
        frame = new JFrame();
        JButton b1 = new JButton("Btn 1");
        JButton b2 = new JButton("Btn 2");
        JButton b3 = new JButton("Btn 3");
        JButton b4 = new JButton("Btn 4");
        JButton b5 = new JButton("Btn 5");
        JButton b6 = new JButton("Btn 6");
        JButton b7 = new JButton("Btn 7");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);

        // frame.setLayout(new GridLayout());
        // frame.setLayout(new GridLayout(2,4));
        frame.setLayout(new GridLayout(2,4, 10,20));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new c_gridlayout();
    }
}
