package t_java_gui_swing.a_swing_components;

import javax.swing.*;

public class a_jframe extends JFrame {

    public a_jframe() {
        setSize(400, 400); // Set the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify the close operation
    }

    public static void main(String[] args) {
        a_jframe frame = new a_jframe();    // Create an instance of the JFrame subclass      
        frame.setVisible(true); // Make the frame visible
    }
}
