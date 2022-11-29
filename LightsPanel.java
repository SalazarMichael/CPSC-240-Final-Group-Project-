import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightsPanel extends JPanel {
    LightDrawing lights = new LightDrawing();
    private long currentTime;
    String lightColor = lights.getActiveLight();
    public LightsPanel(){

        JButton startButton = new JButton("Start");
        JLabel instructions = new JLabel("Player 1 will press S and Player 2 will press L when the light goes green");
        lights.setPreferredSize(new Dimension(360,460));

        buttonListener l = new buttonListener();
        startButton.addActionListener(l);


        add(lights);
        add(startButton);
        add(instructions);


    }
    class buttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            lights.changeColorY();

            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            // your code here
                            lights.changeColorG();
                        }
                    },
                    1000
            );

        }

    }
    public long getCurrentTime() {
        currentTime = System.currentTimeMillis();
        return currentTime;
    }

}
