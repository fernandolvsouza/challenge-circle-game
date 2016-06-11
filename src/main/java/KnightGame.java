import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by flvs on 6/10/16.
 */
public class KnightGame {



    public static void main(String[] args) {


        Knight[] players = new Knight[6];
        players[0] = new Knight(100,"player 0");
        players[1] = new Knight(100,"player 1");
        players[2] = new Knight(100,"player 2");
        players[3] = new Knight(100,"player 3");
        players[4] = new Knight(100,"player 4");
        players[5] = new Knight(100,"player 5");


        int round = 0;
        int alives = 6;
        int i = 0;
        Knight lastPlayerAlive = null;

        while(alives > 1) {

            if(i == 6)
                i = 0;
            if(i == 0)
                round++;

            Knight currentPlayer = players[i];
            if (currentPlayer.alive()) {
                if (lastPlayerAlive != null) {
                    Punch p = new Punch();
                    p.value = thrownDice();
                    lastPlayerAlive.punch(players[i], p);

                    if(!currentPlayer.alive()) {
                        alives--;
                        System.out.println( currentPlayer.toString() + " dies in round " + round );
                    }

                    System.out.println(p);
                }
            }
            if(currentPlayer.alive())
                lastPlayerAlive = players[i];

            i++;
        }

        System.out.println("winner : " + winner(players));
    }

    private static Knight winner(Knight[] players) {

        for (int i = 0; i < players.length; i++) {
            if(players[i].alive())
                return players[i];
        }
        return null;
    }


    private static int thrownDice(){
        return 1 + (int)(Math.random() * 6);
    }
}
