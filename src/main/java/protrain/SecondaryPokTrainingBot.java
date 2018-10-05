package protrain;

public class SecondaryPokTrainingBot extends Bot{
    public SecondaryPokTrainingBot() {
        super();
    }


    @Override
    public void run() {
        try {
            run = true;
            while (run) {

                int stepNumber = 19;
                int waitAfterSteps = 7;

                int waitForOppentsAttack = 19;
                int waitAfterFight = 17;

                //Steps
                for (int i = 1; i < stepNumber; i++) {
                    up(1);
                    down(2);
                    System.out.println("Step iteration: " + i + " | " + (stepNumber-2));
                }

                for (int i = 1; i < waitAfterSteps; i++) {
                    System.out.println("Wait " + i + " sec | " + (waitAfterSteps-2));
                    botWait(1000);
                }

                //Pkm selection
                System.out.println("Select Pokemon");
                selectOption(2);
                botWait(500);
                System.out.println("Select second Pkm");
                selectOption(2);


                //Wait for opponents attack
                for (int i = 1; i < waitForOppentsAttack; i++) {
                    System.out.println("Wait " + i + " sec | " + (waitForOppentsAttack-2));
                    botWait(1000);
                }


                //Attack
                System.out.println("Attack option");
                selectOption(1);
                botWait(500);
                System.out.println("Attack");
                selectOption(1);

                for (int i = 1; i < waitAfterFight; i++) {
                    System.out.println("Wait " + i + " sec | " + (waitAfterFight-2));
                    botWait(1000);
                }

                System.out.println("********s**********************");
            }
        } catch (InterruptedException e) {
            System.out.println("Fishing Bot Stopped");
        }
    }

}
