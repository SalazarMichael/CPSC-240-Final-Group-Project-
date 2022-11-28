import java.util.*;
import java.io.*;

public class Player {
    private String playerName;
    private File timeSheet;


    public Player (String inName ){
        playerName = inName;
    }

public void saveTime(double newTime) throws FileNotFoundException {
timeSheet = new File("/timeslips" + playerName);

PrintWriter timeSave = new PrintWriter(timeSheet);

timeSave.println(newTime);
}
}
