package com.Calculator;

import com.Calculator.GUI.Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operations implements ActionListener {

    static char operation;
    static double firstNumber;
    static boolean startOfCalculation = true;

    // used in order to une numbers longer than one digit by "building" them, pressing different buttons one after the other
    static String buildingFirstNumber = "";

    // see as buildingFirstNumber
    static String buildingSecondNumber = "";
    static double secondNumber;

    private static void whenEqualIsPressed() {
        if (!buildingFirstNumber.equals(""))
            firstNumber = Double.parseDouble(buildingFirstNumber);
        secondNumber = Double.parseDouble(buildingSecondNumber);
        System.out.print(firstNumber + " " + operation + " " + secondNumber + " = ");
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
        System.out.println(firstNumber);
        operation = '\u0000';
        buildingFirstNumber = "";
        buildingSecondNumber = "";
    }

    public static ActionListener numbersListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == Buttons.oneButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "1";
                    System.out.println(buildingFirstNumber);
                }
                else {
                    buildingSecondNumber += "1";
                }
            if (o == Buttons.twoButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "2";
                }
                else {
                    buildingSecondNumber += "2";
                }
            if (o == Buttons.threeButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "3";
                }
                else {
                    buildingSecondNumber += "3";
                }
            if (o == Buttons.fourButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "4";
                }
                else {
                    buildingSecondNumber += "4";
                }
            if (o == Buttons.fiveButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "5";
                }
                else {
                    buildingSecondNumber += "5";
                }
            if (o == Buttons.sixButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "6";
                }
                else {
                    buildingSecondNumber += "6";
                }
            if (o == Buttons.sevenButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "7";
                }
                else {
                    buildingSecondNumber += "7";
                }
            if (o == Buttons.eightButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "8";
                }
                else {
                    buildingSecondNumber += "8";
                }
            if (o == Buttons.nineButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "9";
                }
                else {
                    buildingSecondNumber += "9";
                }
            if (o == Buttons.zeroButton)
                if (startOfCalculation) {
                    buildingFirstNumber += "0";
                }
                else {
                    buildingSecondNumber += "0";
                }
        }
    };

    public static ActionListener operationsListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == Buttons.additionButton)
                operation = '+';
            if (o == Buttons.subtractionButton)
                operation = '-';
            if (o == Buttons.multiplicationButton)
                operation = '*';
            if (o == Buttons.divisionButton)
                operation = '/';
            startOfCalculation = false;
        }
    };

    public static ActionListener otherButtonsListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == Buttons.equalButton)
                whenEqualIsPressed();
            if (o == Buttons.resetButton) {
                // Reset all variables to default
                operation = '\u0000';
                firstNumber = 0.0d;
                startOfCalculation = true;
                buildingFirstNumber = "";
                buildingSecondNumber = "";
                secondNumber = 0.0d;
            }
        }
    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
