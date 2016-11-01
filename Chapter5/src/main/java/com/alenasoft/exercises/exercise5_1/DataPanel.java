package com.alenasoft.exercises.exercise5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Luis Roberto Perez on 1/11/2016.
 */
public class DataPanel extends JPanel {

    private final JTextField childDataTextField;
    private final JTextField menDataTextField;
    private final JTextField womenDataTextField;
    private DataModel data;

    public DataPanel(DataModel data) {
        this.data = data;

        JPanel form = new JPanel(new GridLayout(3,2));

        this.setLayout(new FlowLayout());

        this.childDataTextField = new JTextField(10);
        this.childDataTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(childDataTextField.getText().length() != 0) {
                    int value = Integer.parseInt(childDataTextField.getText());
                    updateData("Children", value);
                }
            }
        });

        this.menDataTextField = new JTextField(10);
        this.menDataTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(menDataTextField.getText().length() != 0) {
                    int value = Integer.parseInt(menDataTextField.getText());
                    updateData("Men", value);
                }
            }
        });

        this.womenDataTextField = new JTextField(10);
        this.womenDataTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(womenDataTextField.getText().length() != 0) {
                    int value = Integer.parseInt(womenDataTextField.getText());
                    updateData("Women", value);
                }
            }
        });

        form.add(new JLabel("Children: "));
        form.add(childDataTextField);
        form.add(new JLabel("Women"));
        form.add(womenDataTextField);
        form.add(new JLabel("Men: "));
        form.add(menDataTextField);

        this.add(form);
    }

    private void updateData(String key, int value) {
        this.data.updateData(key, value);
    }
}
