import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Leaderboard {
    private ArrayList<Player> leaderboard;
    private Player player;
    public Leaderboard(){
        this.leaderboard = new ArrayList<Player>();
    }
    public static void bubblesrt(ArrayList<Player> list) throws FileNotFoundException {
        Player temp;
        if (list.size() > 1) // check if the number of orders is larger than 1
        {
            for (int x = 0; x < list.size(); x++) // bubble sort outer loop
            {
                for (int i = 0; i < list.size() - i; i++) {
                    if (list.get(i).getTime() != (list.get(i + 1).getTime())) {
                        {
                            temp = list.get(i);
                            list.set(i, list.get(i + 1));
                            list.set(i + 1, temp);
                        }
                    }
                }
            }

        }
    }
    //get time for a player

    //bubble sort through the current leader board to add player to leaderboard
    public void addPlayer(Player p1) throws FileNotFoundException {
        leaderboard.add(p1);
        bubblesrt(leaderboard);
    }
}


