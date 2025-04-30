package t_java_gui_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class aa_jpanel {
    aa_jpanel() {
        JFrame f = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        JButton b1 = new JButton("Hello");
        b1.setBounds(50, 100, 80, 30);
        b1.setBackground(Color.yellow);
        JButton b2 = new JButton("Welcome");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new aa_jpanel();
    }
}
