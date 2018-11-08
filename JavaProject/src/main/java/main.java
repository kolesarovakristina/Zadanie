import gui.Storage;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Storage");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setContentPane(new Storage().getPnlBackground());
        frame.setVisible(true);
    }
}
