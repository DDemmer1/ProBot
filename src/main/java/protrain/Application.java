package protrain;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;


public class Application {


//    public static Move[] vermillionFishing = new Move[0];
    public static Move[] vermillionFishingPC;
    public static Move[] route10;

    public static final double trainTime = 3D;
    public static final double pokecenterTime = 1D;

    public static void main(String[] args) {

        init();

        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
        logger.setUseParentHandlers(false);


        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }


        // Addinglisteners.
        GlobalScreen.addNativeKeyListener(new GlobalKeyboardListener());

    }



    public static void init() {
        File dataDir = new File("data");
        if (!dataDir.exists())
            dataDir.mkdir();

        try {
//            vermillionFishing=  new B1otFileParser().parse(new File("data/VermillionCityFishing.txt"));
//            vermillionFishingPC =  new BotFileParser().parse(new File("data/VermillionCityFishingPC.txt"));
            route10 =  new BotFileParser().parse(new File("data/route_10.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}