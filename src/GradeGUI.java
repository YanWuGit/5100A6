import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GradeGUI extends JFrame implements ActionListener
{
    private JTextArea outputDisplay;
    private JTextField totalPoints;
    private JTextField earnedPoints;
    private JTextField percentageWeight;
    private JButton runButton;


    public GradeGUI (){
        buildGUI(); //generate the GUI
        setTitle("Grade Calculator");
        pack();
        setVisible(true);
    } // constructor

    private void buildGUI(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        outputDisplay = new JTextArea(1, 1);
        totalPoints = new JTextField((10));
        earnedPoints = new JTextField((10));
        percentageWeight = new JTextField((10));
        runButton = new JButton("Calculate");
        runButton.addActionListener(this);

        // construct the input section
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Total Assignment points:"));
        inputPanel.add(totalPoints);
        inputPanel.add(new JLabel("Earned points:"));
        inputPanel.add(earnedPoints);
        inputPanel.add(new JLabel("Percentage of class:"));
        inputPanel.add(percentageWeight);
        inputPanel.add(runButton);
        inputPanel.add(new JLabel("Weighted Score:"));

        // format the input section in a box layout
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));

        // orient output beneath input section
        contentPane.add("Center", inputPanel);
        contentPane.add("South", outputDisplay);
    }// generate the GUI

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == runButton)
        {
            // get input Strings from input fields and convert them into Doubles
            Double WGtotalPoints = Double.parseDouble(totalPoints.getText());
            Double WGearnedPoints = Double.parseDouble(earnedPoints.getText());
            Double WGpercentage = Double.parseDouble(percentageWeight.getText());

            // instantiate a WeightGrade object with the data retrieved from the user
            WeightGrade weightGrade = new WeightGrade(WGtotalPoints, WGearnedPoints, WGpercentage);

            // calculate the score
            weightGrade.percentageEarned();

            // display the score on GUI
            outputDisplay.append(String.valueOf(weightGrade.getPercentageEarned()));
        }
    }
}
