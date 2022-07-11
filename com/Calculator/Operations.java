package com.Calculator;

import com.Calculator.GUI.Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {

    static char operation;
    static double firstNumber;
    static double secondNumber;

    private static void whenSecondNumberPressed() {
        if (operation == '+') {
            firstNumber += secondNumber;
        }
        if (operation == '-') {
            firstNumber -= secondNumber;
        }
        if (operation == '*') {
            firstNumber *= secondNumber;
        }
        if (operation == '/') {
            firstNumber /= secondNumber;
        }
        if (operation != '\u0000') {
            System.out.println(firstNumber);
            operation = '\u0000';
        }
    }

    public static ActionListener numbersListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == Buttons.oneButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 1;
                }
                else {
                    secondNumber = 1;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.twoButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 2;
                }
                else {
                    secondNumber = 2;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.threeButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 3;
                }
            else {
                secondNumber = 3;
                whenSecondNumberPressed();
            }
            if (o == Buttons.fourButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 4;
                    System.out.println("4");
                }
                else {
                    secondNumber = 4;
                    System.out.println("4");
                    whenSecondNumberPressed();
                }
            if (o == Buttons.fiveButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 5;
                }
                else {
                    secondNumber = 5;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.sixButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 6;
                }
                else {
                    secondNumber = 6;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.sevenButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 7;
                }
                else {
                    secondNumber = 7;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.eightButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 8;
                }
                else {
                    secondNumber = 8;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.nineButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 9;
                }
                else {
                    secondNumber = 9;
                    whenSecondNumberPressed();
                }
            if (o == Buttons.zeroButton)
                if (firstNumber == 0.0d) {
                    firstNumber = 0;
                }
                else {
                    secondNumber = 0;
                    whenSecondNumberPressed();
                }
        }
    };

    public static ActionListener operationsListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == Buttons.additionButton) {
                operation = '+';
            }
            if (o == Buttons.subtractionButton)
                operation = '-';
            if (o == Buttons.multiplicationButton)
                operation = '*';
            if (o == Buttons.divisionButton)
                operation = '/';
            System.out.println(operation);
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
