import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Game extends JFrame{
    private Player player1;
    private Player player2;


    public void Gamerun(Player p1In, Player p2In){
        player1 = p1In;
        player2 = p2In;


        JFrame frame = new JFrame("Pro Tree");
        JPanel panel = new LightsPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(panel);

        frame.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e){
                int keyCode = e.getKeyCode();


            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
