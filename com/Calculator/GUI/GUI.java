package com.Calculator.GUI;

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
        panel.add(Buttons.resetButton);
        panel.add(Buttons.changeSignButton);
        panel.add(Buttons.percentButton);
        panel.add(Buttons.divisionButton);
        panel.add(Buttons.sevenButton);
        panel.add(Buttons.eightButton);
        panel.add(Buttons.nineButton);
        panel.add(Buttons.multiplicationButton);
        panel.add(Buttons.fourButton);
        panel.add(Buttons.fiveButton);
        panel.add(Buttons.sixButton);
        panel.add(Buttons.subtractionButton);
        panel.add(Buttons.oneButton);
        panel.add(Buttons.twoButton);
        panel.add(Buttons.threeButton);
        panel.add(Buttons.additionButton);
        panel.add(Buttons.zeroButton);
        panel.add(Buttons.emptyButton);
        panel.add(Buttons.commaButton);
        panel.add(Buttons.equalButton);

        Buttons.additionButton.addActionListener(operationsListener);
        Buttons.subtractionButton.addActionListener(operationsListener);
        Buttons.multiplicationButton.addActionListener(operationsListener);
        Buttons.divisionButton.addActionListener(operationsListener);

    }
    ActionListener operationsListener = new ActionListener() {
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

