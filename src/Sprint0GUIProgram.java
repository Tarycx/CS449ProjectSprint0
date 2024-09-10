import javax.swing.*;
import java.awt.*;


//CS449 Sprint0 GUI Programming: text, lines, check box, radio buttons
//GUI Library: Swing
public class Sprint0GUIProgram { 

    public static void main(String[] args) {
        //Create the main frame
        JFrame frame = new JFrame("Sprint0 GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);

        //Add a text label
        JLabel label = new JLabel("Choose your options:");
        frame.add(label);

        //Add a line (using a separator)
        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(400, 10));
        frame.add(separator);

        //Add a check box
        JCheckBox checkBox = new JCheckBox("Check Box 1");
        frame.add(checkBox);

        //Add radio buttons
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1)); //3 rows, 1 column

        JRadioButton radioButton1 = new JRadioButton("Radio Button A");
        JRadioButton radioButton2 = new JRadioButton("Radio Button B");
        JRadioButton radioButton3 = new JRadioButton("Radio Button C");

        //Group radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        //Add radio buttons to panel
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        radioPanel.add(radioButton3);

        frame.add(radioPanel);


        //Bottom Line
        JSeparator separator2 = new JSeparator();
        separator2.setPreferredSize(new Dimension(400, 10));
        frame.add(separator2);

        //End Text
        JLabel label2 = new JLabel("Sprint0 GUI Programming");
        JLabel label3 = new JLabel( "(text, lines, check box, radio buttons)");
        frame.add(label2);
        frame.add(label3);


        //Display the frame
        frame.setVisible(true);
    }
}
