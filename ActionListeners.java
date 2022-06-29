import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListeners implements ActionListener{


    ActionListeners buttonListener = new ActionListeners(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Buttons.additionButton)
                System.out.println("Addition");
            else if (e.getSource() == Buttons.subtractionButton) {
                System.out.println("Subtraction");
            } else if (e.getSource() == Buttons.multiplicationButton) {
                System.out.println("Multiplication");
            } else if (e.getSource() == Buttons.divisionButton) {
                System.out.println("Division");
            }
        }
    };


}
