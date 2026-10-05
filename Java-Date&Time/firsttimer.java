import java.util.*;
public class firsttimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's Up !");
            }
        };

        timer.schedule(task, 5000);
    }
}