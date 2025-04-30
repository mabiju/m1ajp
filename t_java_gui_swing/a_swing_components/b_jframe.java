package t_java_gui_swing.a_swing_components;

import java.awt.*;
import javax.swing.*;

public class b_jframe extends JFrame {
    public b_jframe() {
        super("This is the title of this Frame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Hello Sanothimi");
        add(label);

        JButton btn = new JButton("Click Me");
        add(btn);
    }

    public static void main(String[] args) {
        b_jframe frame = new b_jframe();
        frame.setVisible(true);
    }
}
