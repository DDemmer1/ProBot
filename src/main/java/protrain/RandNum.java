package protrain;

import java.util.Random;

public class RandNum {


    public static long randomLong(int min , int max) {
        Random rand = new Random();

        long  n = rand.nextInt(max) + min;

        return n;
    }

}