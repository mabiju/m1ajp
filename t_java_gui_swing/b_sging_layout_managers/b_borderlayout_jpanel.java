package t_java_gui_swing.b_sging_layout_managers;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class b_borderlayout_jpanel extends JFrame {
    b_borderlayout_jpanel(){
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());
        pa.add(new JButton("Header"), BorderLayout.NORTH);
        pa.add(new JButton("Footer"), BorderLayout.SOUTH);
        pa.add(new JButton("Content"), BorderLayout.CENTER);
        pa.add(new JButton("Sidebar"), BorderLayout.EAST);
        pa.add(new JButton("Vertical Menu"), BorderLayout.WEST);

        add(pa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new b_borderlayout_jpanel();
    }
}
