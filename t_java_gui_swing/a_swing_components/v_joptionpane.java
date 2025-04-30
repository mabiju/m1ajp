package t_java_gui_swing.a_swing_components;

import javax.swing.*;

public class v_joptionpane {
    JFrame optionPane_f;

    v_joptionpane() {
        optionPane_f = new JFrame();
        JOptionPane.showMessageDialog(optionPane_f, "Hello, Welcome to Sanothimi College");
    }

    public static void main(String[] args) {
        new v_joptionpane();
    }
}
