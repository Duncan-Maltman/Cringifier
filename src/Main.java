import javax.swing.JFrame;
import  javax.swing.JTextField;
import  javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //Creates Frame
        JFrame frame = new JFrame("Cringifier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creates Subject Field
        JLabel subjText = new JLabel("Subject");
        subjText.setBounds(20,10,100,20);
        JTextField subjField = new JTextField();
        subjField.setText("");
        subjField.setBounds(20,30,100,30);

        //Creates Multiplier Field
        JLabel multText = new JLabel("Multiplier (Int)");
        multText.setBounds(150,10,100,20);
        JTextField multField = new JTextField();
        multField.setText("100");
        multField.setBounds(150,30,100,30);

        //Creates Output Field
        JTextField outfield = new JTextField();
        outfield.setText("Subject is (Int)% cringe");
        outfield.setBounds(20,70,230,30);

        //Create Button
        JButton button = new JButton("Calculate");
        button.setBounds(90,120,100,30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ButtonPress) {

                String subj = subjField.getText();

                String mult = multField.getText();

                try{

                    int multInt = Integer.parseInt(mult);
                } catch (Exception NotInt) {
                    outfield.setText("Multiplier is not an integer");

                }

                outfield.setText(subj + " is " + CringeDeterminer(Integer.parseInt(mult)) + "% cringe");

            }
        });

        frame.add(subjText);
        frame.add(multText);
        frame.add(subjField);
        frame.add(multField);
        frame.add(outfield);
        outfield.setEditable(false);
        frame.add(button);
        frame.setSize(300,200);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    //Returns Number from 1 To (Multiplier - 1)
    public static int CringeDeterminer(int CringeMultiplier) {

        return (int)(Math.random()*CringeMultiplier);

    }
}