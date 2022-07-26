package com.Calculator.GUI;

import com.Calculator.Operations;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){


        //JPanel panel = new JPanel(new GridBagLayout());
        //GridBagConstraints c = new GridBagConstraints();

        //For each component to be added to this container:
        //...Create the component...
        //...Set instance variables in the GridBagConstraints instance...
        // panel.add(theComponent, c);
        // doesn't work just like the form doesn't work, nothing works .

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 4));
        // panel.add(Buttons.outputField);
        // can't freaking figure out how to add this it's been 6 days
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

        Buttons.additionButton.addActionListener(Operations.operationsListener);
        Buttons.subtractionButton.addActionListener(Operations.operationsListener);
        Buttons.multiplicationButton.addActionListener(Operations.operationsListener);
        Buttons.divisionButton.addActionListener(Operations.operationsListener);

        Buttons.oneButton.addActionListener(Operations.numbersListener);
        Buttons.twoButton.addActionListener(Operations.numbersListener);
        Buttons.threeButton.addActionListener(Operations.numbersListener);
        Buttons.fourButton.addActionListener(Operations.numbersListener);
        Buttons.fiveButton.addActionListener(Operations.numbersListener);
        Buttons.sixButton.addActionListener(Operations.numbersListener);
        Buttons.sevenButton.addActionListener(Operations.numbersListener);
        Buttons.eightButton.addActionListener(Operations.numbersListener);
        Buttons.nineButton.addActionListener(Operations.numbersListener);
        Buttons.zeroButton.addActionListener(Operations.numbersListener);

        Buttons.equalButton.addActionListener(Operations.otherButtonsListener);
        Buttons.resetButton.addActionListener(Operations.otherButtonsListener);
        Buttons.changeSignButton.addActionListener(Operations.otherButtonsListener);
    }
    
}

