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
        String player1Name = textInput1.getText();
        String player2Name = textInput2.getText();
        System.out.println("button pressed");
        System.out.println(player1Name);
        System.out.println(player2Name);


        if (!player1Name.equals("") && !player2Name.equals("")){
            Player player1 = new Player(player1Name);
            Player player2 = new Player(player2Name);
            System.out.println("names in");
            Game gameOn = new Game();
            gameOn.Gamerun(player1, player2);



        }
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
        frame.getContentPane().add(button);

        frame.pack();
        frame.setVisible(true);


    }

}

