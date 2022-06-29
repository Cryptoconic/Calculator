import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends Buttons {

    private JPanel panel;
    private JFrame frame;


    public GUI() {

        panel = new JPanel();
        frame = new JFrame();

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 4));
        panel.add(additionButton);
        panel.add(subtractionButton);
        panel.add(multiplicationButton);
        panel.add(divisionButton);

        additionButton.addActionListener();
        subtractionButton.addActionListener();
        multiplicationButton.addActionListener();
        divisionButton.addActionListener();

    }

}
