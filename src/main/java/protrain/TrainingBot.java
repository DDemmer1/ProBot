package protrain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TrainingBot extends Bot {


    public TrainingBot(){
        super();
    }


    @Override
    public void run() {
        try {
            run = true;
            while(run) {
                left(2);
                attack();
                right(2);
                attack();
            }
        } catch (InterruptedException e) {
            System.out.println("Bot Stopped");
        }

    }




}