package com.gongoliers.pacgongo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {
        initUI();
    }

    private void initUI() {

        add(new Board(), BorderLayout.CENTER);
        setTitle("PacGongo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(370, 420);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman ex = new Pacman();
                ex.setVisible(true);
            }
        });
    }
}
