package t_java_gui_swing.a_swing_components;

import javax.swing.*;

public class w_jtable {
    JFrame f;

    w_jtable() {
        f = new JFrame();
        String data[][] = {
                { "111", "Ram", "Ayodhya" },
                { "112", "Sita", "Mithila" },
                { "113", "Laxman", "Ayodhya" } };
        String column[] = { "ID", "NAME", "Address" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new w_jtable();
    }
}
