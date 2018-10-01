package protrain;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class Bot extends Thread {

    protected Robot robot;
    private long moveSpeed = 270;
//    private long moveSpeed = 300;
    protected static boolean run = true;


    public Bot() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    protected void left(int steps) throws InterruptedException {
        if (run) {
            for (int i = 0; i < steps; i++) {
                if (run) {
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    this.sleep(moveSpeed);
                }
            }

        }
    }


    protected void right(int steps) throws InterruptedException {
        if (run) {
            for (int i = 0; i < steps; i++) {
                if (run) {
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);
                    this.sleep(moveSpeed);

                }
            }

        }
    }

    protected void down(int steps) throws InterruptedException {
        if (run) {
            for (int i = 0; i < steps; i++) {
                if (run) {
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    this.sleep(moveSpeed);
                }
            }

        }
    }


    protected void up(int steps) throws InterruptedException {
        if (run) {
            for (int i = 0; i < steps; i++) {
                if (run) {
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_W);
                    this.sleep(moveSpeed);
                }
            }

        }
    }


    protected void interact() throws InterruptedException {
        if (run) {
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
            this.sleep(RandNum.randomLong(80, 100));
        }
    }


    protected void attack() throws InterruptedException {
        if (run) {
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
//            this.sleep(RandNum.randomLong(80, 100));
        }

    }


    protected void changePokemon(int pokeNum) throws InterruptedException {
        if (run) {
            robot.keyPress(Integer.valueOf("0x3" + pokeNum));
            robot.keyRelease(Integer.valueOf("0x3" + pokeNum));
            this.sleep(RandNum.randomLong(80, 100));
            robot.keyPress(Integer.valueOf("0x3" + pokeNum));
            robot.keyRelease(Integer.valueOf("0x3" + pokeNum));
            this.sleep(RandNum.randomLong(80, 100));
        }
    }

    protected void botWait(long time) throws InterruptedException {
        if (run)
            this.sleep(time);

    }


    protected void selectOption(int optionNum) throws InterruptedException {
        if (run) {
            robot.keyPress(0x30 + optionNum);
            robot.keyRelease(0x30 + optionNum);
        }
    }


    protected static void stopBot() {
        run = false;
    }


}
