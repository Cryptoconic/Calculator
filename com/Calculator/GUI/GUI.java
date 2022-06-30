package com.Calculator.GUI;

import com.Calculator.GUI.Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public GUI() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 4));
        panel.add(Buttons.additionButton);
        panel.add(Buttons.subtractionButton);
        panel.add(Buttons.multiplicationButton);
        panel.add(Buttons.divisionButton);

        Buttons.additionButton.addActionListener(al);
        Buttons.subtractionButton.addActionListener(al);
        Buttons.multiplicationButton.addActionListener(al);
        Buttons.divisionButton.addActionListener(al);

    }
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == Buttons.additionButton)
                System.out.println("Addition");
            else if (o == Buttons.subtractionButton)
                System.out.println("Subtraction");
            else if (o == Buttons.multiplicationButton)
                System.out.println("Multiplication");
            else if (o == Buttons.divisionButton)
                System.out.println("Division");
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Default");
    }
}

