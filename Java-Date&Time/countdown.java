import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class countdown {
    public static void main(String[] args) {

        Timer t = new Timer();
        TimerTask tk = new TimerTask() {

            int c = 10;

            @Override 
            public void run() {
                System.out.println(c);
                c--;
                if (c < 0) {
                    System.out.println("Game on !");
                    t.cancel();
                }
            } 
            
        };

        t.scheduleAtFixedRate(tk, 0, 1000);


    }
}