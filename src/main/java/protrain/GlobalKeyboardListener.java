package protrain;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class GlobalKeyboardListener implements NativeKeyListener{


    public GlobalKeyboardListener() {
    }

    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {

    }

    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
        TrainingBot tb = new TrainingBot();

        MoveBot mb = new MoveBot();


        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_F11) {
            tb = new TrainingBot();
            tb.start();
            System.out.println("TBOT STARTED");
        }

        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_F12) {
            System.out.println("BOT INTERRUPTED");
            tb.stopBot();
            mb.stopBot();
        }


        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_F10) {

            Move[] moves = {
                            new Move(50 , 'R'),
                            new Move(6 , 'U'),
                            new Move(10 , 'R'),
                            new Move(3000 , 'W'),
                            new Move(7 , 'R'),
                            new Move(12 , 'D'),
                            new Move(18 , 'R'),
                            new Move(4 , 'U'),
                            new Move(3000 , 'W'),

                            //in Pokecenter
                            new Move(6 , 'U'),
                            new Move(0 , 'I'),
                            new Move(1000 , 'W'),
                            new Move(0 , 'I'),
                            new Move(1000 , 'W'),
                            new Move(0 , 'I'),
                            new Move(1000 , 'W'),
                            new Move(1 , 'O'),
                            new Move(1000 , 'W'),

                            new Move(0 , 'I'),
                            new Move(2000 , 'W'),
                            new Move(0 , 'I'),
                            new Move(1000 , 'W'),
                            new Move(0 , 'I'),
                            new Move(1000 , 'W'),
                            new Move(6 , 'D'),
                            new Move(3000 , 'W'),

                            //outside Pokecenter

                            new Move(2 , 'D'),
                            new Move(17 , 'L'),
                            new Move(13 , 'U'),
                            new Move(9 , 'L'),
                            new Move(3000 , 'W'),

                            new Move(8 , 'L'),
                            new Move(7 , 'D'),
                            new Move(10 , 'L'),





            };
            mb = new MoveBot(moves);
            mb.start();
        }






    }

    public void nativeKeyReleased(NativeKeyEvent nativeEvent) {

    }

}