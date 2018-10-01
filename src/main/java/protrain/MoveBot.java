package protrain;

public class MoveBot extends Bot{

    private Move[] moveList;

    public MoveBot(Move[] moveList){
        super();
        this.moveList = moveList;
    }


    public MoveBot(){

    }


    @Override
    public void run() {
        try {
            run = true;
            move();
            run = false;
        } catch (InterruptedException e) {
            System.out.println("Bot Stopped");
        }

    }


    protected void move() throws InterruptedException {

        Thread thread = new Thread(){
            public void run(){
                while(run){
                    try {
                        selectOption(4);
                        this.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();


        for (Move move: moveList) {

            switch (move.getAction()) {
                case 'U':  up(move.getAmount());
                    break;
                case 'D':  down(move.getAmount());
                    break;
                case 'L':  left(move.getAmount());
                    break;
                case 'R':  right(move.getAmount());
                    break;
                case 'W':  botWait(move.getAmount());
                    break;
                case 'I':  interact();
                    break;
                case 'A':  attack();
                    break;
                case 'O':  selectOption(move.getAmount());
                    break;
            }
        }
    }


}
