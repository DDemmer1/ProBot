package protrain;

public class Move {

    private int amount;
    private char action;

    public Move(int amount, char action){
        this.action = action;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public char getAction() {
        return action;
    }

}
