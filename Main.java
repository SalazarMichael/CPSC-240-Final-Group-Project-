import javax.swing.*;
import java.awt.event.*;
class ButtonListener implements ActionListener{
    private JTextField textInput1;
    private JTextField textInput2;
    public ButtonListener(JTextField t1, JTextField t2) {
        textInput1 = t1;
        textInput2 = t2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    }


public class Main {

    private String player1;
    private String player2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Reaction Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JButton button = new JButton("Ready!");
        JTextField player1Name = new JTextField();
        JTextField player2Name = new JTextField();
        JLabel instructions = new JLabel("Enter Player Names");

        frame.getContentPane().add(instructions);
        frame.getContentPane().add(player1Name);
        frame.getContentPane().add(player2Name);
        button.addActionListener(new ButtonListener(player1Name, player2Name));

        frame.pack();
        frame.setVisible(true);


    }

}

