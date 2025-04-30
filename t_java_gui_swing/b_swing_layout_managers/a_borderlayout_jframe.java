package t_java_gui_swing.b_swing_layout_managers;

import java.awt.*;
import javax.swing.*;

public class a_borderlayout_jframe {
    JFrame frame;

    a_borderlayout_jframe() {
        frame = new JFrame();

        JButton b1 = new JButton("Ram");
        JButton b2 = new JButton("Laxman");
        JButton b3 = new JButton("Sita");
        JButton b4 = new JButton("Hari");
        JButton b5 = new JButton("Gita");

        frame.setLayout(new BorderLayout(20,10));
        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.CENTER);
        frame.add(b4, BorderLayout.EAST);
        frame.add(b5, BorderLayout.WEST);

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new a_borderlayout_jframe();
    }
}
