package chapter1.exercise1_23;

/**
 *
 * @author ivan
 */
class Player {
    
    String name;
    boolean isMyTurn = false;
    boolean isWinner = false;
    
    public Player(String name) {
        this.name = name;
    }
    
    public void setTurn(boolean turn) {
        this.isMyTurn = turn;
    }
    
    public void changeTurn(Player pl2) {
        if (this.isMyTurn) {
            isMyTurn = false;
            pl2.isMyTurn = true;
        }
    }
    
}
