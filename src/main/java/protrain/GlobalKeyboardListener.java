package protrain;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.awt.*;
import java.awt.event.KeyEvent;


public class GlobalKeyboardListener implements NativeKeyListener{


    public GlobalKeyboardListener() {
    }

    public void nativeKeyTyped(NativeKeyEvent nativeEvent) {

    }

    public void nativeKeyPressed(NativeKeyEvent nativeEvent) {
        TrainingBot tb = new TrainingBot();
        FishingBot fb = new FishingBot();
        SecondaryPokTrainingBot sb = new SecondaryPokTrainingBot();
        MoveBot mb = new MoveBot();


            if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_F11) {

            tb= new TrainingBot();
            tb.start();
            System.out.println("**********************************");
            System.out.println("TRAINING BOT STARTED");

            Thread thread = new Thread(){

                public void run(){
                    try {

                        for (int i = 0; i < Application.trainTime; i++) {
                            System.out.println(Application.trainTime-i + "min left on Training-Timer");
                            Thread.sleep(60000);
                        }

                        try {
                            new Robot().keyPress(KeyEvent.VK_F12);
                            new Robot().keyRelease(KeyEvent.VK_F12);

                            Thread.sleep(500);
                            new Robot().keyPress(KeyEvent.VK_F9);
                            new Robot().keyRelease(KeyEvent.VK_F9);
                        } catch (AWTException e) {
                            e.printStackTrace();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            };

            thread.start();

        }

        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_F12) {
            System.out.println("BOT INTERRUPTED");
            tb.stopBot();
            mb.stopBot();
            fb.stopBot();
            sb.stopBot();
        }

        if (nativeEvent.getKeyCode() == NativeKeyEvent.VC_F9) {

            System.out.println("POKECENTER BOT STARTED");

            mb = new MoveBot(Application.route10);
            mb.start();


            Thread thread = new Thread(){

                public void run(){
                    try {

                        for (int i = 0; i < Application.pokecenterTime; i++) {
                            System.out.println(Application.pokecenterTime-i + "min left on Pokecenter-Timer");
                            Thread.sleep(60000);
                        }


                        try {

                            new Robot().keyPress(KeyEvent.VK_F11);
                            new Robot().keyRelease(KeyEvent.VK_F11);
                        } catch (AWTException e) {
                            e.printStackTrace();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            };

            thread.start();

        }




        }

    public void nativeKeyReleased(NativeKeyEvent nativeEvent) {

    }




}