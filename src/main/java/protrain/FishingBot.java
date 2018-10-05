package protrain;

public class FishingBot extends Bot {

    public FishingBot() {
        super();
    }

    @Override
    public void run() {
        try {
            run = true;
            while (run) {
                attack();
                botWait(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Fishing Bot Stopped");
        }
    }
}
