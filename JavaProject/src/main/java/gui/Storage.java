package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Storage {
    private JPanel pnlBackground;
    private JButton btnInsert;

    Insert insert = new Insert();

    public Storage() {
        btnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    openInsertTable();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    private void openInsertTable() throws IOException {
        insert.createTable();
        System.out.println("insert table is open");
    }

    public JPanel getPnlBackground() {
        return pnlBackground;
    }


}
